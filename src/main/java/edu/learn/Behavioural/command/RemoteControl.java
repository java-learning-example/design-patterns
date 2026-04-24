package edu.learn.Behavioural.command;

public class RemoteControl {
    public void press(Command command) {
        // Invoker does not know command internals.
        command.execute();
    }
}
