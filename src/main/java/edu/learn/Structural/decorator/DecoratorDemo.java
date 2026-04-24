package edu.learn.Structural.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Coffee order = new CaramelDecorator(new MilkDecorator(new SimpleCoffee()));
        System.out.println(order.description() + " => $" + order.cost());
    }
}
