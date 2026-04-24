package edu.learn.Structural.decorator;

public class SimpleCoffee implements Coffee {
    @Override
    public String description() { return "Simple coffee"; }

    @Override
    public double cost() { return 3.0; }
}
