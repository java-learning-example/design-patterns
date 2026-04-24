package java.learn.Structural.flyweight;

import java.util.HashMap;
import java.util.Map;

class TextStyle {
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

class TextStyleFactory {
    private final Map<String, TextStyle> cache = new HashMap<>();

    public TextStyle get(String font, int size) {
        String key = font + ":" + size;
        return cache.computeIfAbsent(key, k -> new TextStyle(font, size));
    }
}

public class FlyweightDemo {
    public static void main(String[] args) {
        TextStyleFactory factory = new TextStyleFactory();

        TextStyle style1 = factory.get("Arial", 12);
        TextStyle style2 = factory.get("Arial", 12);

        style1.draw("Hello", 10, 10);
        style2.draw("World", 20, 20);
        System.out.println("Same shared object: " + (style1 == style2));
    }
}
