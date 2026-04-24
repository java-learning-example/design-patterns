package edu.learn.Structural.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        VideoService service = new VideoServiceProxy();
        service.play("guest", "Architecture 101");
        service.play("admin", "Architecture 101");
    }
}
