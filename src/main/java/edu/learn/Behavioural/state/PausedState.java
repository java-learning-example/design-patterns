package edu.learn.Behavioural.state;

public class PausedState implements PlayerState {
    @Override
    public void pressPlay(MediaPlayer player) {
        System.out.println("Playing media...");
        player.setState(new PlayingState());
    }
}
