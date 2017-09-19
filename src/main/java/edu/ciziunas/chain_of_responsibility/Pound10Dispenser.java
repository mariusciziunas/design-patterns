package edu.ciziunas.chain_of_responsibility;

/**
 * The handler of 10 pounds nominals. It doesn't give change for less than 10 pounds
 */
public class Pound10Dispenser implements DispenseChain {

    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.dispenseChain = dispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 10) {
            int num = currency.getAmount() / 10;
            System.out.println("dispensing " + num + " x 10 pound notes");
        } else {
            System.out.println("dispense coins: " + currency.getAmount());
        }
    }
}
