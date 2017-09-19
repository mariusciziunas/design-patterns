package edu.ciziunas.chain_of_responsibility;

public class TestCashMachine {

    /**
     * Cash machine dispenser which gives change in 50, 20 and 10 pounds nominals.
     * Pound dispenser classes are handlers to process the change. Every handler sets the next handler to take over the remainder and process it.
     * Passing the remainder from handler to handler they make up the chain.
     * @param args
     */
    public static void main(String[] args) {
        DispenseChain pound50Dispenser = new Pound50Dispenser();
        DispenseChain pound20Dispenser = new Pound20Dispenser();
        DispenseChain pound10Dispenser = new Pound10Dispenser();

        pound50Dispenser.setNextChain(pound20Dispenser);
        pound20Dispenser.setNextChain(pound10Dispenser);

        pound50Dispenser.dispense(new Currency(131));
    }
}
