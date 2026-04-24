package edu.learn.Structural.proxy;

public class RealVideoService implements VideoService {
    @Override
    public void play(String user, String title) {
        System.out.println("Streaming " + title + " for " + user);
    }
}
