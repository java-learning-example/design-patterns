package edu.learn.Structural.flyweight;

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
