package java.learn.Behavioural.state;

interface PlayerState {
    void pressPlay(MediaPlayer player);
}

class PlayingState implements PlayerState {
    public void pressPlay(MediaPlayer player) {
        System.out.println("Pausing media...");
        player.setState(new PausedState());
    }
}

class PausedState implements PlayerState {
    public void pressPlay(MediaPlayer player) {
        System.out.println("Playing media...");
        player.setState(new PlayingState());
    }
}

class MediaPlayer {
    private PlayerState state = new PausedState();

    public void setState(PlayerState state) { this.state = state; }

    public void pressPlay() {
        state.pressPlay(this);
    }
}

public class StateDemo {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();
        player.pressPlay();
        player.pressPlay();
    }
}
