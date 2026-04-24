package edu.learn.Structural.facade;

public class HomeTheaterFacade {
    private final VideoDecoder videoDecoder = new VideoDecoder();
    private final AudioDecoder audioDecoder = new AudioDecoder();
    private final Screen screen = new Screen();

    // Facade exposes one simple method over complex subsystem calls.
    public void watchMovie(String file) {
        videoDecoder.decode(file);
        audioDecoder.decode(file);
        screen.show();
    }
}
