package edu.learn.Behavioural.visitor;

public class Rectangle implements Shape {
    @Override
    public void accept(ShapeVisitor visitor) { visitor.visit(this); }
}
