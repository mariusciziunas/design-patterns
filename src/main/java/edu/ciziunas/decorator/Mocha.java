package edu.ciziunas.decorator;

/**
 * Mocha condiment implementation which adds its price to an existing price and appends the description
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        return  super.getCost() + 4;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", mocha";
    }
}
