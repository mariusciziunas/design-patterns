package edu.ciziunas.factory_abstract;

/**
 * The 'store' is a factory pattern implementation, which has a reference to another factory
 */
public class CiziunasComputerStore implements ComputerStore {

    private AbstractComponentFactory abstractComponentFactory;

    public CiziunasComputerStore(AbstractComponentFactory abstractComponentFactory) {
        this.abstractComponentFactory = abstractComponentFactory;
    }

    public Computer getComputer(String type) {
        Computer computer = null;
        if ("lenovo".equals(type)) {
            computer = new LenovoComputer(abstractComponentFactory);
        } else if ("apple".equals(type)) {
            computer = new AppleComputer(abstractComponentFactory);
        } else {
            throw new UnsupportedOperationException("This type is not implemented yet");
        }
        computer.buildComputer();
        return computer;
    }

}
