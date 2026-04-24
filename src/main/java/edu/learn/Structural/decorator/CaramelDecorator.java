package edu.learn.Structural.decorator;

public class CaramelDecorator extends CoffeeDecorator {
    public CaramelDecorator(Coffee coffee) { super(coffee); }

    @Override
    public String description() { return coffee.description() + ", caramel"; }

    @Override
    public double cost() { return coffee.cost() + 1.0; }
}
