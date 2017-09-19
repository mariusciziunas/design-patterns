package edu.ciziunas.decorator;

/**
 * Whip condiment implementation which adds its price to an existing price and appends the description
 */
public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
       super(beverage);
    }

    @Override
    public int getCost() {
        return super.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", whip";
    }
}
