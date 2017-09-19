package edu.ciziunas.state;

/**
 * An ipod implementation.
 * Ipod can be played, stopped and paused. These states are implemented in 'State' implementations.
 * An Ipod class is a context to control transitions between the states.
 */
public class TestIpodUser {

    public static void main(String[] args) {
        Ipod ipod = new Ipod();
        ipod.pressPause();
        ipod.pressPlay();
        ipod.pressPause();
        ipod.pressPlay();
        ipod.pressPlay();
    }
}
