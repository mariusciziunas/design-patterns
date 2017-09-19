package edu.ciziunas.observer;

/**
 * This is sometimes named as 'Subject' which is used for objects to register/unregister.
 * I think naming 'publisher/producer' is easier to understand
 */
public interface Publisher {

    void register(Reader reader);

    void unregister(Reader reader);

    void publish();
}
