package edu.learn.Structural.bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        Remote remote = new BasicRemote(new TV());
        remote.power();
        remote.power();
    }
}
