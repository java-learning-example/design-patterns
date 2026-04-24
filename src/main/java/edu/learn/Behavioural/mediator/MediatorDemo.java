package edu.learn.Behavioural.mediator;

interface ChatMediator {
    void send(String message, User sender);
    void register(User user);
}

abstract class User {
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

class ChatRoom implements ChatMediator {
    private final java.util.List<User> users = new java.util.ArrayList<>();

    public void register(User user) { users.add(user); }

    public void send(String message, User sender) {
        for (User user : users) {
            if (user != sender) user.receive(sender.name + ": " + message);
        }
    }
}

class ChatUser extends User {
    public ChatUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    public void receive(String message) {
        System.out.println(name + " received -> " + message);
    }
}

public class MediatorDemo {
    public static void main(String[] args) {
        ChatRoom room = new ChatRoom();

        User alice = new ChatUser(room, "Alice");
        User bob = new ChatUser(room, "Bob");

        room.register(alice);
        room.register(bob);

        alice.send("Hi Bob");
    }
}
