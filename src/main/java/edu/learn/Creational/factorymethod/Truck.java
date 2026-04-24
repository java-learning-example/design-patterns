package edu.learn.Creational.factorymethod;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Deliver by road in a truck");
    }
}
