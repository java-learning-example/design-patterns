package edu.learn.Structural.bridge;

public abstract class Remote {
    protected final Device device;

    protected Remote(Device device) {
        this.device = device;
    }

    public abstract void power();
}
