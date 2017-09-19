package edu.ciziunas.command;

/**
 * Actual command implementation
 */
public class FriesOrder implements Order {

    @Override
    public void make() {
        System.out.println("Fries frying");
    }
}
