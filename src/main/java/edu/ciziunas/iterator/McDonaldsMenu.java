package edu.ciziunas.iterator;

import java.util.ArrayList;
import java.util.List;

public class McDonaldsMenu {

    private List<MenuItem> menuItems = new ArrayList<>();

    /**
     * Let's add some data to menu
     */
    public McDonaldsMenu() {
        menuItems.add(new MenuItem("MacChicken", 3));
        menuItems.add(new MenuItem("Magnuckets", 1));
        menuItems.add(new MenuItem("McChips", 3));
        menuItems.add(new MenuItem("Cheesburger", 5));
    }

    public Iterator createIterator() {
        return new McDonaldsIterator(menuItems);
    }
}
