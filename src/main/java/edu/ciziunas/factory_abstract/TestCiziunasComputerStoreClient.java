package edu.ciziunas.factory_abstract;

public class TestCiziunasComputerStoreClient {

    /**
     * Ciziunas's Computer store sells branded computers. There are just 'apple' and 'lenovo' so far in stock so far.
     * Because the suppliers' factories are located across the world, it is possible to choose the closer to the store. Chinese factory for this store.
     * AbstractComponentFactory makes an interface for the suppliers where ChineseComponentFactory is an actual implementation of how to create separate components of computer.
     * The CiziunasComputerStore object has a reference to the factory so that it knows which factory to use.
     */
    public static void main(String[] args) {
        AbstractComponentFactory chineseComponentFactory = new ChineseComponentFactory();
        ComputerStore computerStore = new CiziunasComputerStore(chineseComponentFactory);
        Computer mac = computerStore.getComputer("apple");
        mac.startComputer();
    }

}
