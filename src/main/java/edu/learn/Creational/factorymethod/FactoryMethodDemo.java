package edu.learn.Creational.factorymethod;

interface Transport {
    void deliver();
}

class Truck implements Transport {
    public void deliver() {
        System.out.println("Deliver by road in a truck");
    }
}

class Ship implements Transport {
    public void deliver() {
        System.out.println("Deliver by sea in a ship");
    }
}

abstract class Logistics {
    // Factory method: subclasses decide the product type.
    protected abstract Transport createTransport();

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}

class RoadLogistics extends Logistics {
    protected Transport createTransport() { return new Truck(); }
}

class SeaLogistics extends Logistics {
    protected Transport createTransport() { return new Ship(); }
}

public class FactoryMethodDemo {
    public static void main(String[] args) {
        Logistics logistics = args.length > 0 && "sea".equalsIgnoreCase(args[0])
                ? new SeaLogistics()
                : new RoadLogistics();

        logistics.planDelivery();
    }
}
