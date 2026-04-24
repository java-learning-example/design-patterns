package edu.learn.Structural.bridge;

interface Device {
    void turnOn();
    void turnOff();
}

class TV implements Device {
    public void turnOn() { System.out.println("TV on"); }
    public void turnOff() { System.out.println("TV off"); }
}

class Radio implements Device {
    public void turnOn() { System.out.println("Radio on"); }
    public void turnOff() { System.out.println("Radio off"); }
}

abstract class Remote {
    protected final Device device;

    protected Remote(Device device) {
        this.device = device;
    }

    public abstract void power();
}

class BasicRemote extends Remote {
    private boolean on;

    public BasicRemote(Device device) {
        super(device);
    }

    public void power() {
        on = !on;
        if (on) device.turnOn(); else device.turnOff();
    }
}

public class BridgeDemo {
    public static void main(String[] args) {
        Remote remote = new BasicRemote(new TV());
        remote.power();
        remote.power();
    }
}
