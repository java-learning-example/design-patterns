package edu.learn.Structural.bridge;

public class BasicRemote extends Remote {
    private boolean on;

    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void power() {
        on = !on;
        if (on) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }
}
