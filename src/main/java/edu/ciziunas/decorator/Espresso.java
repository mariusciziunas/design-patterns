package edu.ciziunas.decorator;

/**
 * Actual Espresso beverage with price and description
 */
public class Espresso implements Beverage {

    @Override
    public int getCost() {
        return 2;
    }

    @Override
    public String getDescription() {
        return "espresso";
    }

}
