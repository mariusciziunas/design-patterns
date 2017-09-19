package edu.ciziunas.proxy.protection;

/**
 * POJO for person data
 */
public class PersonImpl implements Person {

    private String name;
    private int rating;

    public PersonImpl(String name) {
        this.name = name;
    }

    public void setHotOrNotRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHotOrNotRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
