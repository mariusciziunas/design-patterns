package edu.ciziunas.factory_method;

/**
 * Classic pizza factory is used by american chef so he is making pepperoni pizza
 */
public class ClassicPizzaFactory extends PizzaFactory {

    @Override
    public Pizza createPizza() {
        System.out.println("Classic pizza factory creates pepperoni pizza");
        return new ClassicPizza();
    }

}
