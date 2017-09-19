package edu.ciziunas.state;

public class StoppedState implements State {

    private Ipod ipad;

    public StoppedState(Ipod ipad) {
        this.ipad = ipad;
    }

    @Override
    public void stop() {
        System.out.println("It is stopped at the moment");
    }

    @Override
    public void play() {
        System.out.println("Playing");
        ipad.setState(ipad.getPlayingState());
    }

    @Override
    public void pause() {
        System.out.println("You should play first");
    }
}
