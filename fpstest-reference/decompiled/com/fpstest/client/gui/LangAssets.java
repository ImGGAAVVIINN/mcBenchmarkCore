package com.fpstest.client.gui;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(EnvType.CLIENT)
final class LangAssets {
   private static final Logger LOG = LoggerFactory.getLogger("fpstest-i18n");

   private LangAssets() {
   }

   static Map<String, String> read(String locale) {
      Map<String, String> out = new HashMap<>();
      String path = "/assets/fpstest/lang/" + locale + ".json";

      try {
         Object var9;
         try (InputStream in = LangAssets.class.getResourceAsStream(path)) {
            if (in != null) {
               String text = new String(in.readAllBytes(), StandardCharsets.UTF_8);
               parseFlatJson(text, out);
               return out;
            }

            var9 = out;
         }

         return (Map<String, String>)var9;
      } catch (IOException var8) {
         LOG.warn("[FPS Test] failed to read {}", path, var8);
         return out;
      }
   }

   private static void parseFlatJson(String src, Map<String, String> out) {
      int i = 0;
      int n = src.length();

      while (i < n) {
         int ks = src.indexOf(34, i);
         if (ks < 0) {
            return;
         }

         int ke = findUnescapedQuote(src, ks + 1);
         if (ke < 0) {
            return;
         }

         String key = unescape(src.substring(ks + 1, ke));
         int colon = src.indexOf(58, ke);
         if (colon < 0) {
            return;
         }

         int vs = src.indexOf(34, colon);
         if (vs < 0) {
            return;
         }

         int ve = findUnescapedQuote(src, vs + 1);
         if (ve < 0) {
            return;
         }

         String value = unescape(src.substring(vs + 1, ve));
         out.put(key, value);
         i = ve + 1;
      }
   }

   private static int findUnescapedQuote(String s, int from) {
      for (int i = from; i < s.length(); i++) {
         char c = s.charAt(i);
         if (c == '\\') {
            i++;
         } else if (c == '"') {
            return i;
         }
      }

      return -1;
   }

   private static String unescape(String s) {
      if (s.indexOf(92) < 0) {
         return s;
      } else {
         StringBuilder sb = new StringBuilder(s.length());

         for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '\\' && i + 1 < s.length()) {
               char n = s.charAt(++i);
               switch (n) {
                  case '"':
                     sb.append('"');
                     break;
                  case '/':
                     sb.append('/');
                     break;
                  case '\\':
                     sb.append('\\');
                     break;
                  case 'n':
                     sb.append('\n');
                     break;
                  case 'r':
                     sb.append('\r');
                     break;
                  case 't':
                     sb.append('\t');
                     break;
                  case 'u':
                     if (i + 4 < s.length()) {
                        String hex = s.substring(i + 1, i + 5);

                        try {
                           int cp = Integer.parseInt(hex, 16);
                           sb.append((char)cp);
                           i += 4;
                        } catch (NumberFormatException var7) {
                           LOG.warn("[FPS Test] lang: malformed \\u escape '{}' — keeping literal", hex);
                           sb.append('\\').append('u');
                        }
                     } else {
                        LOG.warn("[FPS Test] lang: truncated \\u escape near end of string — keeping literal");
                        sb.append('\\').append('u');
                     }
                     break;
                  default:
                     sb.append(n);
               }
            } else {
               sb.append(c);
            }
         }

         return sb.toString();
      }
   }
}
