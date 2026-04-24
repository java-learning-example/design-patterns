package edu.learn.Behavioural.state;

public class MediaPlayer {
    private PlayerState state = new PausedState();

    public void setState(PlayerState state) { this.state = state; }

    public void pressPlay() {
        state.pressPlay(this);
    }
}
