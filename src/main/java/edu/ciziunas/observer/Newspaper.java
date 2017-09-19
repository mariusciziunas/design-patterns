package edu.ciziunas.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Actual implementation of a publisher/producer/subject
 */
public class Newspaper implements Publisher {

    private List<Reader> readers = new ArrayList<>();

    @Override
    public void register(Reader reader) {
        readers.add(reader);
    }

    @Override
    public void unregister(Reader reader) {
        readers.remove(reader);
    }

    /**
     * News are sent to the subscribers. Probably in the real world scenario
     * news object would come from method arguments or object state, but let's keep it as simple as possible here
     */
    @Override
    public void publish() {
        News breakingNews = new News("Hurricane Irma destroyed Cornwall");
        for (Reader reader : readers) {
            reader.update(breakingNews);
        }
    }
}
