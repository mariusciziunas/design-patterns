package edu.ciziunas.iterator;

public class NandosMenu {

    private MenuItem[] menuItems = new MenuItem[3];

    /**
     * Let's add some data to the menu
     */
    NandosMenu() {
        menuItems[0] = new MenuItem("Chicken suvliaki", 3);
        menuItems[1] = new MenuItem("Chicken tako", 2);
        menuItems[2] = new MenuItem("Chicken curry", 4);
    }

    public Iterator createIterator() {
        return new NandosIterator(menuItems);
    }

}
