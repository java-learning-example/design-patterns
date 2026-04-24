package java.learn.Behavioural.observer;

import java.util.ArrayList;
import java.util.List;

interface Subscriber {
    void update(String headline);
}

class NewsChannel {
    private final List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) { subscribers.add(subscriber); }

    public void publish(String headline) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(headline);
        }
    }
}

class MobileSubscriber implements Subscriber {
    private final String user;

    public MobileSubscriber(String user) { this.user = user; }

    public void update(String headline) {
        System.out.println(user + " got notification: " + headline);
    }
}

public class ObserverDemo {
    public static void main(String[] args) {
        NewsChannel channel = new NewsChannel();
        channel.subscribe(new MobileSubscriber("Alice"));
        channel.subscribe(new MobileSubscriber("Bob"));

        channel.publish("Java 23 released");
    }
}
