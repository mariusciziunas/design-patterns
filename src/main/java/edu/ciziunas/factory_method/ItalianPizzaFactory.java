package edu.ciziunas.factory_method;

/**
 * Italian pizza factory is used by italian chef so he is making margarita pizza
 */
public class ItalianPizzaFactory extends PizzaFactory {

    @Override
    public Pizza createPizza() {
        System.out.println("Italian factory creates pizza");
        return new ItalianPizza();
    }
}
