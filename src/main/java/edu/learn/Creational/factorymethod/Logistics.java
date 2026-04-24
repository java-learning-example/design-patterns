package edu.learn.Creational.factorymethod;

public abstract class Logistics {
    // Factory method: subclasses decide the product type.
    protected abstract Transport createTransport();

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
