package edu.learn.Behavioural.mediator;

public class ChatUser extends User {
    public ChatUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void receive(String message) {
        System.out.println(name + " received -> " + message);
    }
}
