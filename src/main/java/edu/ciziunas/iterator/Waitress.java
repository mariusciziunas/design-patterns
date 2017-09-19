package edu.ciziunas.iterator;

public class Waitress {

    private NandosMenu nandosMenu;
    private McDonaldsMenu mcDonaldsMenu;

    /**
     *  Waitress learns both menus at the time we employ her
     * @param nandosMenu
     * @param mcDonaldsMenu
     */
    //TODO: yes, we can have a menu interface, but I want explicitly point out different objects
    public Waitress(NandosMenu nandosMenu, McDonaldsMenu mcDonaldsMenu) {
        this.nandosMenu = nandosMenu;
        this.mcDonaldsMenu = mcDonaldsMenu;
    }

    void printMenu() {
        printMenu(nandosMenu.createIterator());
        printMenu(mcDonaldsMenu.createIterator());
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + " - " + menuItem.getPrice());
        }
    }
}
