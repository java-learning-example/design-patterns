package edu.learn.Structural.proxy;

public class VideoServiceProxy implements VideoService {
    private final RealVideoService real = new RealVideoService();

    @Override
    public void play(String user, String title) {
        // Proxy adds access control before delegating.
        if (!"admin".equalsIgnoreCase(user)) {
            System.out.println("Access denied for user: " + user);
            return;
        }
        real.play(user, title);
    }
}
