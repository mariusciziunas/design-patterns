package edu.ciziunas.singleton;

/**
 * The key points for Singleton is private constructor and public static getInstance() method to access the instance.
 */
public class Config {

    private static Config instance;

    private Config() {};

    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    public void printProperty() {
        System.out.println("Print a property");
    }
}
