package edu.ciziunas.observer;

/**
 * Actual implementation of consumer/subscriber/observer
 */
public class Person implements Reader {

    private String name;

    public Person(String name, Publisher publisher) {
        publisher.register(this);
        this.name = name;
    }

    @Override
    public void update(News news) {
        System.out.println(name + " got the update with a headline '" + news.getHeadline() + "'");
    }
}
