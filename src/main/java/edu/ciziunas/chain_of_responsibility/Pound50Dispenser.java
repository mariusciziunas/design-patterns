package edu.ciziunas.chain_of_responsibility;

/**
 * The handler of 50 pounds nominals. It does the processing and passes the remainder to a next handler
 */
public class Pound50Dispenser implements DispenseChain {

    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.dispenseChain = dispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 50) {
            int num = currency.getAmount() / 50;
            int remainder = currency.getAmount() % 50;
            System.out.println("dispensing " + num + " x 50 pound notes");
            dispenseChain.dispense(new Currency(remainder));
        } else {
            dispenseChain.dispense(currency);
        }
    }
}
