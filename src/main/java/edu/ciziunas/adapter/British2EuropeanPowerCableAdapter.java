package edu.ciziunas.adapter;

/**
 * Adapter forwards the request from one interface to another one
 */
public class British2EuropeanPowerCableAdapter implements TwoPinPowerCable {

    private ThreePinPowerCable threePinPowerCable;

    public British2EuropeanPowerCableAdapter(ThreePinPowerCable threePinPowerCable) {
        this.threePinPowerCable = threePinPowerCable;
    }

    @Override
    public void plugTwoPins() {
        System.out.println("Converting 3 pin power cable to 2 pin one");
        threePinPowerCable.plugTreePins();
    }
}
