package edu.learn.Behavioural.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        NewsChannel channel = new NewsChannel();
        channel.subscribe(new MobileSubscriber("Alice"));
        channel.subscribe(new MobileSubscriber("Bob"));

        channel.publish("Java 23 released");

        YouTubeChannel ytChannel = new YouTubeChannel("telusko");
        ytChannel.subscribe(new YouTubeSubscriber("java_learner"));
        ytChannel.subscribe(new YouTubeSubscriber("_dev@java"));

        ytChannel.upload("Design Patterns: behaviour - observer tutorial");
    }
}
