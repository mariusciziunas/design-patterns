package edu.ciziunas.observer;

/**
 * This is called subscriber/consumer/observer
 */
public interface Reader {

    /**
     * It is invoked by consumer update
     * @param news
     */
    void update(News news);
}
