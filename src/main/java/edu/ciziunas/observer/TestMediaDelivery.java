package edu.ciziunas.observer;

public class TestMediaDelivery {

    /**
     * 3 guys and a company 'Sky' subscribed the Guardian and the Guardian published an update
     * @param args
     */
    public static void main(String[] args) {
        Publisher guardian = new Newspaper();
        Person tom = new Person("Tom", guardian);
        Person marius = new Person("Marius", guardian);
        Person max = new Person("Max", guardian);

        Company sky = new Company("Sky", guardian);

        guardian.publish();
    }
}
