package edu.ciziunas.decorator;

/**
 * Actual Machiato beverage with price and description
 */
public class Machiato implements Beverage {

    @Override
    public int getCost() {
        return 3;
    }

    @Override
    public String getDescription() {
        return "machiato";
    }
}
