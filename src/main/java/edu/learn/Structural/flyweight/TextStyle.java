package edu.learn.Structural.flyweight;

public class TextStyle {
    private final String font;
    private final int size;

    public TextStyle(String font, int size) {
        this.font = font;
        this.size = size;
    }

    public void draw(String text, int x, int y) {
        System.out.println("Draw '" + text + "' at (" + x + "," + y + ") with " + font + "-" + size);
    }
}
