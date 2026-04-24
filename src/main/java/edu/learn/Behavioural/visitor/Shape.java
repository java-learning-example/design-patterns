package edu.learn.Behavioural.visitor;

public interface Shape {
    void accept(ShapeVisitor visitor);
}
