package edu.ciziunas.chain_of_responsibility;

public interface DispenseChain {

    void setNextChain(DispenseChain dispenseChain);

    void dispense(Currency currency);
}
