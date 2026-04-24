package edu.learn.Behavioural.observer;

public class MobileSubscriber implements Subscriber {
    private final String user;

    public MobileSubscriber(String user) {
        this.user = user;
    }

    @Override
    public void update(String headline) {
        System.out.println(user + " got notification: " + headline);
    }
}
