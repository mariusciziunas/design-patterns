package edu.ciziunas.iterator;

import java.util.List;

/**
 * Custom itearator for McDonalds menu
 */
public class McDonaldsIterator implements Iterator {

    private List<MenuItem> menuItems;
    private int position;

    public McDonaldsIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return (position < menuItems.size());
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }
}
