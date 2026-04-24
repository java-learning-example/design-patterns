package edu.learn.Behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsChannel {
    private final List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void publish(String headline) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(headline);
        }
    }
}
