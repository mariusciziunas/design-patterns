package edu.ciziunas.state;

public class PausedState implements State {

    private Ipod ipad;

    public PausedState(Ipod ipad) {
        this.ipad = ipad;
    }

    @Override
    public void stop() {
        System.out.println("Stopped playing");
        ipad.setState(ipad.getStoppedState());
    }

    @Override
    public void play() {
        System.out.println("Playing");
        ipad.setState(ipad.getPlayingState());
    }

    @Override
    public void pause() {
        System.out.println("It has already been paused");
    }
}
