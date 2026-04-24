package edu.learn.Creational.factorymethod;

public class SeaLogistics extends Logistics {
    @Override
    protected Transport createTransport() { return new Ship(); }
}
