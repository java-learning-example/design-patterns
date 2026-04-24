package edu.learn.Behavioural.command;

public class CommandDemo {
    public static void main(String[] args) {
        Light light = new Light();
        RemoteControl remote = new RemoteControl();

        remote.press(new LightOnCommand(light));
        remote.press(new LightOffCommand(light));
    }
}
