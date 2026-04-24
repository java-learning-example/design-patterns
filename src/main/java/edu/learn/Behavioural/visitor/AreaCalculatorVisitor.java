package edu.learn.Behavioural.visitor;

public class AreaCalculatorVisitor implements ShapeVisitor {
    @Override
    public void visit(Circle circle) { System.out.println("Area logic for Circle"); }

    @Override
    public void visit(Rectangle rectangle) { System.out.println("Area logic for Rectangle"); }
}
