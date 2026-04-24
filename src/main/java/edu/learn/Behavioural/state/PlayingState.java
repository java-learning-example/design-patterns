package edu.learn.Behavioural.state;

public class PlayingState implements PlayerState {
    @Override
    public void pressPlay(MediaPlayer player) {
        System.out.println("Pausing media...");
        player.setState(new PausedState());
    }
}
