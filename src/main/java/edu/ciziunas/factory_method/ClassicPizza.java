package edu.ciziunas.factory_method;

public class ClassicPizza implements Pizza {

    @Override
    public void bake() {
        System.out.println("Baking Classic pizza");
    }

}
