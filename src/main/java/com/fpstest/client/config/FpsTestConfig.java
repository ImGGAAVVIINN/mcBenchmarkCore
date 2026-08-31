package com.fpstest.client.config;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(EnvType.CLIENT)
public final class FpsTestConfig {
    private static final Logger LOG = LoggerFactory.getLogger("fpstest-config");
    public HudAnchor hudAnchor = HudAnchor.TOP_LEFT;
    public boolean hudCompact = false;
    public boolean completionSound = true;
    public String locale = null;
    private static FpsTestConfig INSTANCE;

    public static synchronized FpsTestConfig get() {
        if (INSTANCE == null) {
            INSTANCE = load();
        }
        return INSTANCE;
    }

    private static Path path() {
        return Minecraft.getInstance().gameDirectory.toPath().resolve("config").resolve("fpstest.json");
    }

    private static FpsTestConfig load() {
        Path p = path();
        FpsTestConfig c = new FpsTestConfig();
        if (!Files.exists(p)) {
            return c;
        }
        try {
            String text = Files.readString(p);
            String anchor = grabString(text, "hud_anchor");
            if (anchor != null) {
                try {
                    c.hudAnchor = HudAnchor.valueOf(anchor.toUpperCase(Locale.ROOT));
                } catch (IllegalArgumentException ignored) {
                }
            }

            Boolean compact = grabBool(text, "hud_compact");
            if (compact != null) {
                c.hudCompact = compact;
            }

            Boolean snd = grabBool(text, "completion_sound");
            if (snd != null) {
                c.completionSound = snd;
            }

            String loc = grabString(text, "locale");
            if (loc != null && !loc.isEmpty()) {
                if (isKnownLocale(loc)) {
                    c.locale = loc;
                } else {
                    LOG.warn("[FPS Test] config: unknown locale '{}', falling back to vanilla", loc);
                }
            }
        } catch (Throwable var8) {
            LOG.warn("[FPS Test] config load failed, using defaults", var8);
        }
        return c;
    }

    public synchronized void save() {
        try {
            Path p = path();
            Files.createDirectories(p.getParent());
            StringBuilder sb = new StringBuilder("{\n");
            sb.append("  \"hud_anchor\": \"").append(this.hudAnchor.name().toLowerCase(Locale.ROOT)).append("\",\n");
            sb.append("  \"hud_compact\": ").append(this.hudCompact).append(",\n");
            sb.append("  \"completion_sound\": ").append(this.completionSound).append(",\n");
            sb.append("  \"locale\": ").append(this.locale == null ? "null" : "\"" + this.locale + "\"").append("\n");
            sb.append("}\n");
            Files.writeString(p, sb.toString());
        } catch (IOException var3) {
            LOG.warn("[FPS Test] config save failed", var3);
        }
    }

    private static String grabString(String src, String key) {
        int i = src.indexOf("\"" + key + "\"");
        if (i < 0) {
            return null;
        }
        int colon = src.indexOf(':', i);
        if (colon < 0) {
            return null;
        }
        int s = src.indexOf('"', colon + 1);
        if (s < 0) {
            return null;
        }
        StringBuilder out = new StringBuilder();
        int j = s + 1;
        while (j < src.length()) {
            char ch = src.charAt(j);
            if (ch == '\\' && j + 1 < src.length()) {
                char nx = src.charAt(j + 1);
                switch (nx) {
                    case '"':
                        out.append('"');
                        break;
                    case '\\':
                        out.append('\\');
                        break;
                    case 'n':
                        out.append('\n');
                        break;
                    case 'r':
                        out.append('\r');
                        break;
                    case 't':
                        out.append('\t');
                        break;
                    default:
                        out.append(ch);
                        out.append(nx);
                }
                j += 2;
            } else {
                if (ch == '"') {
                    return out.toString();
                }
                out.append(ch);
                j++;
            }
        }
        return null;
    }

    private static Boolean grabBool(String src, String key) {
        int i = src.indexOf("\"" + key + "\"");
        if (i < 0) {
            return null;
        }
        int colon = src.indexOf(':', i);
        if (colon < 0) {
            return null;
        }
        String tail = src.substring(colon + 1).trim();
        if (matchesLiteral(tail, "true")) {
            return Boolean.TRUE;
        }
        return matchesLiteral(tail, "false") ? Boolean.FALSE : null;
    }

    private static boolean isKnownLocale(String loc) {
        return loc.equals("en_us")
                || loc.equals("ru_ru")
                || loc.equals("uk_ua")
                || loc.equals("es_es")
                || loc.equals("fr_fr")
                || loc.equals("de_de")
                || loc.equals("zh_cn")
                || loc.equals("ja_jp");
    }

    private static boolean matchesLiteral(String tail, String lit) {
        if (!tail.startsWith(lit)) {
            return false;
        }
        if (tail.length() == lit.length()) {
            return true;
        }
        char nx = tail.charAt(lit.length());
        return nx == ',' || nx == '}' || nx == ' ' || nx == '\t' || nx == '\n' || nx == '\r';
    }

    @Environment(EnvType.CLIENT)
    public enum HudAnchor {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT;

        public String labelKey() {
            return "fpstest.hud_anchor." + this.name().toLowerCase(java.util.Locale.ROOT);
        }

        public HudAnchor next() {
            HudAnchor[] values = values();
            return values[(this.ordinal() + 1) % values.length];
        }
    }
}
