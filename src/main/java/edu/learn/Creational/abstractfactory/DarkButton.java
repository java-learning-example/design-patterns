package edu.learn.Creational.abstractfactory;

public class DarkButton implements Button {
    @Override
    public void render() {
        System.out.println("Render dark button");
    }
}
