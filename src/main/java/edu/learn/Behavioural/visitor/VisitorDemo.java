package edu.learn.Behavioural.visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Rectangle()};
        ShapeVisitor visitor = new AreaCalculatorVisitor();

        for (Shape shape : shapes) {
            shape.accept(visitor);
        }
    }
}
