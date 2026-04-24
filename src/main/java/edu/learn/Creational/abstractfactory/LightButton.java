package edu.learn.Creational.abstractfactory;

public class LightButton implements Button {
    @Override
    public void render() {
        System.out.println("Render light button");
    }
}
