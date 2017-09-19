package edu.ciziunas.factory_abstract;

public class AppleComputer extends Computer {

    private AbstractComponentFactory componentFactory;

    public AppleComputer(AbstractComponentFactory componentFactory) {
        this.componentFactory = componentFactory;
    }

    @Override
    void buildComputer() {
        System.out.println("Building Apple computer");
        this.ram = componentFactory.createRam();
        this.screen = componentFactory.createScreen();
    }
}
