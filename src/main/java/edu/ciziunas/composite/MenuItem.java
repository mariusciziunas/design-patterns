package edu.ciziunas.composite;

/**
 * This is an actual dish/meal. In other words it is a leaf of the tree.
 * This object(leaf) does not have children so the methods related to structure will not be supported
 */
public class MenuItem extends MenuComponent {

    private String name;
    private String description;
    private int price;

    public MenuItem(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.print(" " + getName());
        System.out.println(", " + getPrice());
        System.out.println("-- " +getDescription());
    }
}
