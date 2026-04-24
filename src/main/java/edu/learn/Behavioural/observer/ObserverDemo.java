package edu.learn.Behavioural.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        NewsChannel channel = new NewsChannel();
        channel.subscribe(new MobileSubscriber("Alice"));
        channel.subscribe(new MobileSubscriber("Bob"));

        channel.publish("Java 23 released");
    }
}
