package edu.learn.Structural.proxy;

interface VideoService {
    void play(String user, String title);
}

class RealVideoService implements VideoService {
    public void play(String user, String title) {
        System.out.println("Streaming " + title + " for " + user);
    }
}

class VideoServiceProxy implements VideoService {
    private final RealVideoService real = new RealVideoService();

    public void play(String user, String title) {
        // Proxy adds access control before delegating.
        if (!"admin".equalsIgnoreCase(user)) {
            System.out.println("Access denied for user: " + user);
            return;
        }
        real.play(user, title);
    }
}

public class ProxyDemo {
    public static void main(String[] args) {
        VideoService service = new VideoServiceProxy();
        service.play("guest", "Architecture 101");
        service.play("admin", "Architecture 101");
    }
}
