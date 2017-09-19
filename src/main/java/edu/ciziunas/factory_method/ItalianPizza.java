package edu.ciziunas.factory_method;

public class ItalianPizza implements Pizza {

    @Override
    public void bake() {
        System.out.println("Baking italian pizza");
    }
}
