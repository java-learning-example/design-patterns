package edu.learn.Behavioural.mediator;

public abstract class User {
    protected final ChatMediator mediator;
    protected final String name;

    protected User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void receive(String message);

    public void send(String message) {
        mediator.send(message, this);
    }
}
