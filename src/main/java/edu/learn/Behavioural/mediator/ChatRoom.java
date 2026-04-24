package edu.learn.Behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    private final List<User> users = new ArrayList<>();

    @Override
    public void register(User user) { users.add(user); }

    @Override
    public void send(String message, User sender) {
        for (User user : users) {
            if (user != sender) user.receive(sender.name + ": " + message);
        }
    }
}
