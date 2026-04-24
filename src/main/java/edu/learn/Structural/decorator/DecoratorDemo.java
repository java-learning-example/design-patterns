package edu.learn.Structural.decorator;

interface Coffee {
    String description();
    double cost();
}

class SimpleCoffee implements Coffee {
    public String description() { return "Simple coffee"; }
    public double cost() { return 3.0; }
}

abstract class CoffeeDecorator implements Coffee {
    protected final Coffee coffee;

    protected CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}

class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) { super(coffee); }

    public String description() { return coffee.description() + ", milk"; }
    public double cost() { return coffee.cost() + 0.8; }
}

class CaramelDecorator extends CoffeeDecorator {
    public CaramelDecorator(Coffee coffee) { super(coffee); }

    public String description() { return coffee.description() + ", caramel"; }
    public double cost() { return coffee.cost() + 1.0; }
}

public class DecoratorDemo {
    public static void main(String[] args) {
        Coffee order = new CaramelDecorator(new MilkDecorator(new SimpleCoffee()));
        System.out.println(order.description() + " => $" + order.cost());
    }
}
