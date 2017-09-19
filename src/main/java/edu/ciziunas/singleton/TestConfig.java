package edu.ciziunas.singleton;

public class TestConfig {

    /**
     * Get instance of the config object and invoke printProperty() method
     * @param args
     */
    public static void main(String[] args) {
        Config.getInstance().printProperty();
    }
}
