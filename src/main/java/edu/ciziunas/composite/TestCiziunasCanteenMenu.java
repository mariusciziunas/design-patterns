package edu.ciziunas.composite;

public class TestCiziunasCanteenMenu {

    /**
     * Menu changes frequently in the restaurant. The change includes not just dishes, but the menu structure as well(Day menu, lunch menu, french menu...).
     * So dynamically created structure is wanted.
     * Use 'Menu' to create a dish and 'MenuItem' to classify the dishes. Then add objects by hierarchy. The structure of the pattern is a tree.
     *
     * Finally give the menu to the waitress to learn and afterwards ask her to tell it loud.
     * @param args
     */
    public static void main(String[] args) {
        // Menu grouping objects
        MenuComponent pancakeHouseMenu =
                new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu =
                new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu =
                new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu =
                new Menu("DESSERT MENU", "Dessert of course!");
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        // add menu items here
        dinerMenu.add(new MenuItem("Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                3));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla icecream",
                1));


        Waitress waitress = new Waitress(allMenus);
        waitress.print();
    }
}
