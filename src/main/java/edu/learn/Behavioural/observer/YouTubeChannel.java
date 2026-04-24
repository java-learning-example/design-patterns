package edu.learn.Behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel {
    private final List<AdvancedSubscriber> subscribers = new ArrayList<>();
    public String name;

    public YouTubeChannel(String name){
        this.name = name;
    }

    public void subscribe(AdvancedSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void upload(String videoName){
        for(var subscriber: subscribers){
            subscriber.update(name, videoName);
        }
    }
}
