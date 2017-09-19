package edu.ciziunas.decorator;

/**
 * Decorator class to add additional functionality - add condiments to the coffee
 */
public abstract class CondimentDecorator implements Beverage {

    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * The actual summing is in the implementation of this class, though we invoke super.getCost() there to have a single control point
     * @return
     */
    @Override
    public int getCost() {
        return beverage.getCost();
    }

    /**
     * The actual concatenation is in the implementation of this class, though we invoke super.getCost() there to have a single control point
     * @return
     */
    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

}