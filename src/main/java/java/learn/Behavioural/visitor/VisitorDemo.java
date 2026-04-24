package java.learn.Behavioural.visitor;

interface Shape {
    void accept(ShapeVisitor visitor);
}

class Circle implements Shape {
    public void accept(ShapeVisitor visitor) { visitor.visit(this); }
}

class Rectangle implements Shape {
    public void accept(ShapeVisitor visitor) { visitor.visit(this); }
}

interface ShapeVisitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
}

class AreaCalculatorVisitor implements ShapeVisitor {
    public void visit(Circle circle) { System.out.println("Area logic for Circle"); }
    public void visit(Rectangle rectangle) { System.out.println("Area logic for Rectangle"); }
}

public class VisitorDemo {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Rectangle()};
        ShapeVisitor visitor = new AreaCalculatorVisitor();

        for (Shape shape : shapes) {
            shape.accept(visitor);
        }
    }
}
