package edu.learn.Creational.factorymethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        Logistics logistics = args.length > 0 && "sea".equalsIgnoreCase(args[0])
                ? new SeaLogistics()
                : new RoadLogistics();

        logistics.planDelivery();
    }
}
