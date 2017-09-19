package edu.ciziunas.adapter;

public class BritishPowerCable implements ThreePinPowerCable {

    @Override
    public void plugTreePins() {
        System.out.println("Plugged three pin english power cable");
    }
}
