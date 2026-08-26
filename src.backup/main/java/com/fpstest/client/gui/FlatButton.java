package com.fpstest.client.gui;

public class FlatButton {
    public final String text;
    public final int x, y, width, height;
    public boolean pressed = false;
    
    public FlatButton(String text, int x, int y, int width, int height) {
        this.text = text;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    public boolean isHovered(int mouseX, int mouseY) {
        return mouseX >= x && mouseX <= x + width && 
               mouseY >= y && mouseY <= y + height;
    }
    
    public void onClick() {
        pressed = true;
    }
    
    public void render() {
        // Render button - to be implemented
    }
}
