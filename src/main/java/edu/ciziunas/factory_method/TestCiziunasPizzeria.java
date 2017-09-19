package edu.ciziunas.factory_method;

/**
 * There are two chefs in Ciziunas's pizzeria kitchen. One is italian and one is american. They both ar the best at their pizzas.
 * PizzaFactory defines the interface how pizza must be baked. They both have freedom to implement createPizza method
 */
public class TestCiziunasPizzeria {

    /**
     * Two pizzas made. One is Italian and another classic pepperoni
     * @param args
     */
    public static void main(String[] args) {
        PizzaFactory italianPizzaFactory = new ItalianPizzaFactory();
        italianPizzaFactory.bakePizza();

        PizzaFactory classicPizzaFactory = new ClassicPizzaFactory();
        classicPizzaFactory.bakePizza();
    }
}
