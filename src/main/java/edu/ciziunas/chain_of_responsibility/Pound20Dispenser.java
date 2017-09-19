package edu.ciziunas.chain_of_responsibility;

/**
 * The handler of 20 pounds nominals. It does the processing and passes the remainder to the next handler
 */
public class Pound20Dispenser implements DispenseChain {

    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.dispenseChain = dispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 20) {
            int num = currency.getAmount() / 20;
            int remainder = currency.getAmount() % 20;
            System.out.println("dispensing " + num + " x 20 pound notes");
            dispenseChain.dispense(new Currency(remainder));
        } else {
            dispenseChain.dispense(currency);
        }
    }
}
