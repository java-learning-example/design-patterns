package edu.learn.Structural.facade;

class VideoDecoder {
    public void decode(String file) {
        System.out.println("Decoding video: " + file);
    }
}

class AudioDecoder {
    public void decode(String file) {
        System.out.println("Decoding audio: " + file);
    }
}

class Screen {
    public void show() {
        System.out.println("Showing movie on screen");
    }
}

class HomeTheaterFacade {
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

public class FacadeDemo {
    public static void main(String[] args) {
        HomeTheaterFacade theater = new HomeTheaterFacade();
        theater.watchMovie("documentary.mp4");
    }
}
