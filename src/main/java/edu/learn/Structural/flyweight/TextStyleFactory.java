package edu.learn.Structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TextStyleFactory {
    private final Map<String, TextStyle> cache = new HashMap<>();

    public TextStyle get(String font, int size) {
        String key = font + ":" + size;
        return cache.computeIfAbsent(key, k -> new TextStyle(font, size));
    }
}
