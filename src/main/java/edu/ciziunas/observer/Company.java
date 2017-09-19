package edu.ciziunas.observer;

/**
 * Actual implementation of consumer/subscriber/observer
 */
public class Company implements Reader {

    private String name;
    private Publisher publisher;

    public Company(String name, Publisher publisher) {
        this.name = name;
        this.publisher = publisher;
        publisher.register(this);
    }

    @Override
    public void update(News news) {
        System.out.println("Company " + name + " got the newspaper with a headline '" + news.getHeadline() + "'");
    }
}
