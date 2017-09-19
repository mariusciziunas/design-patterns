package edu.ciziunas.iterator;

/**
 * Custom itearator for Nandos menu
 */
public class NandosIterator implements Iterator {

    private MenuItem[] menuItems;
    private int position;

    public NandosIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return (position < menuItems.length && menuItems[position] != null);
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}
