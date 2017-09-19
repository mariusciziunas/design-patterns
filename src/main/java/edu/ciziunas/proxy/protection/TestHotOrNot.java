package edu.ciziunas.proxy.protection;

import java.lang.reflect.Proxy;

/**
 * This is the "Hot or Not" matching game implementation. The goal is to get a person match. The game has a user rating based on his popularity in the game.
 * Logged in users can modify their names, but they cannot change their rating.
 */
public class TestHotOrNot {

    public static void main(String[] args) {
        TestHotOrNot test = new TestHotOrNot();
        test.testDrive();
    }

    /**
     * A person is managed through proxy class. Proxy has a same interface as a person implementation.
     */
    public void testDrive() {
        Person donnie = new PersonImpl("Donald Trump");
        Person ownerProxy = getOwnerProxy(donnie);
        System.out.println("getName: " + donnie.getName());
        System.out.println("getName through proxy: " + ownerProxy.getName());

        ownerProxy.setName("Donnie65");
        System.out.println("name: " + donnie.getName());
        System.out.println("name through proxy: " + ownerProxy.getName());

        try {
            ownerProxy.setHotOrNotRating(5);
        } catch (Exception e) {
            System.out.println("Can’t set rating from owner proxy");
        }

        System.out.println("rating: " + ownerProxy.getHotOrNotRating());
    }

    private Person getOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(TestHotOrNot.class.getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

}
