package edu.learn.Behavioural.mediator;

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
