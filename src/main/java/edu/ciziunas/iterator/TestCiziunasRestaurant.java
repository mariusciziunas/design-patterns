package edu.ciziunas.iterator;


public class TestCiziunasRestaurant {

    /**
     * This restaurant doesn't have it's own kitchen so it serves Nandos and McDonald's food.
     * The waitress should know both of them and list to a client. The client shouldn't know where the food comes from. So we want to list just the meal names.
     * <p>
     * Yes, both Nandos and Mac iterators here exactly the same and can be refactored. But I wanted explicitly present two different suppliers.
     *
     * @param args
     */
    public static void main(String[] args) {

        NandosMenu nandosMenu = new NandosMenu();
        McDonaldsMenu mcDonaldsMenu = new McDonaldsMenu();

        Waitress waitres = new Waitress(nandosMenu, mcDonaldsMenu);
        waitres.printMenu();


    }
}
