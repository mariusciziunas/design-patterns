package edu.ciziunas.state;

public class Ipod {

    private State pausedState;
    private State playingState;
    private State stoppedState;

    private State state;

    public Ipod() {
        pausedState = new PausedState(this);
        playingState = new PlayingState(this);
        stoppedState = new StoppedState(this);
        this.state = this.stoppedState;
    }

    void pressPlay() {
        state.play();
    }

    void pressStop() {
        state.stop();
    }

    void pressPause() {
        state.pause();
    }

    public State getPausedState() {
        return pausedState;
    }

    public State getPlayingState() {
        return playingState;
    }

    public State getStoppedState() {
        return stoppedState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
