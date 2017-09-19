package edu.ciziunas.decorator;

public class TestCiziunasCoffee {

    /**
     * A coffee shop where espresso and machiato with double whip and mocha are served.
     * @param args
     */
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        print(espresso);

        Beverage machiato = new Machiato();
        machiato = new Whip(machiato);
        machiato = new Mocha(machiato);
        machiato = new Whip(machiato);
        print(machiato);
    }

    private static void print(Beverage beverage) {
        System.out.println(beverage.getDescription() + ". £" + beverage.getCost());
    }
}
