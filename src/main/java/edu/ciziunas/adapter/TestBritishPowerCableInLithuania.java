package edu.ciziunas.adapter;

public class TestBritishPowerCableInLithuania {

    /**
     * Brits face the power supply problem when they go to Europe(Yeah, Brexit has already started :))
     * British 3 pin plug is not compatible with european 2 pin plug, so the adapter is an amazing tool.
     * Adapter pattern works in the same way...
     * We create a 'three pin plug' object and pass it to the adapter which accepts 'three pin plug' and returns 'two pin plug'
     * @param args
     */
    public static void main(String[] args) {
        ThreePinPowerCable britishPowerCable = new BritishPowerCable();
        TwoPinPowerCable adapter = new British2EuropeanPowerCableAdapter(britishPowerCable);
        adapter.plugTwoPins();
    }
}
