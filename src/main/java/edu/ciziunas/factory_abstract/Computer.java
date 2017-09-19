package edu.ciziunas.factory_abstract;

/**
 * The base class of Computer. This is the product of the store
 */
public abstract class Computer {

    protected Ram ram;
    protected Screen screen;

    abstract void buildComputer();

    public void startComputer() {
        System.out.println("Boooting computer");
    }
}
