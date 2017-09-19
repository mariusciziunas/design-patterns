package edu.ciziunas.factory_method;

/**
 *  Factory class for both chefs
 */
public abstract class PizzaFactory {

    public Pizza bakePizza() {
        Pizza pizza = createPizza();
        pizza.bake();
        return pizza;
    }

    abstract Pizza createPizza();

}
