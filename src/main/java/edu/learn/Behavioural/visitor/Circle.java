package edu.learn.Behavioural.visitor;

public class Circle implements Shape {
    @Override
    public void accept(ShapeVisitor visitor) { visitor.visit(this); }
}
