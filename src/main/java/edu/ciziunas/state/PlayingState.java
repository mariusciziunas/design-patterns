package edu.ciziunas.state;

public class PlayingState implements State {

    private Ipod ipad;

    public PlayingState(Ipod ipad) {
        this.ipad = ipad;
    }

    @Override
    public void stop() {
        System.out.println("Stopped playing");
        ipad.setState(ipad.getStoppedState());
    }

    @Override
    public void play() {
        System.out.println("It has already been played");
    }

    @Override
    public void pause() {
        System.out.println("Paused");
        ipad.setState(ipad.getPausedState());
    }
}
