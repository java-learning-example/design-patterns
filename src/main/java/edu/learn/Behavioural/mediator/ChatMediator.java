package edu.learn.Behavioural.mediator;

public interface ChatMediator {
    void send(String message, User sender);
    void register(User user);
}
