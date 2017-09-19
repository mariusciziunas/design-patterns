package edu.ciziunas.factory_abstract;

/**
 * Implementation of the factory located in China
 */
public class ChineseComponentFactory implements AbstractComponentFactory {

    @Override
    public Ram createRam() {
        System.out.println("Creating chinese RAM");
        return new SdRam();
    }

    @Override
    public Screen createScreen() {
        System.out.println("Creating chinese screen");
        return new LcdScreen();
    }
}
