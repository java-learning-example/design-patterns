package edu.learn.Creational.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        // Build step by step, especially useful for objects with many optional fields.
        Burger order = new Burger.Builder()
                .bun("sesame")
                .patty("chicken")
                .cheese(true)
                .lettuce(true)
                .build();

        System.out.println(order);
    }
}
