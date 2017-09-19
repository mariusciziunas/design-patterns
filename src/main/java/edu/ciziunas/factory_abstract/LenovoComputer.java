package edu.ciziunas.factory_abstract;

public class LenovoComputer extends Computer {

    private AbstractComponentFactory componentFactory;

    public LenovoComputer(AbstractComponentFactory componentFactory) {
        this.componentFactory = componentFactory;
    }

    @Override
    void buildComputer() {
        System.out.println("Building Lenovo computer");
        this.ram = componentFactory.createRam();
        this.screen = componentFactory.createScreen();
    }
}
