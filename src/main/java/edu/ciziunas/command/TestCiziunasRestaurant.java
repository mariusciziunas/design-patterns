package edu.ciziunas.command;

public class TestCiziunasRestaurant {

    /**
     * There is just one waitress - Laima, in ciziunas's restaurant. A client came and he is served by Laima.
     * The client ordered fries and laima forwarded it to the kitchen
     * @param args
     */
    public static void main(String[] args) {
        Waitress laima = new Waitress();
        Client winston = new Client(laima);
        winston.createOrder(new FriesOrder());
        laima.orderUp();
    }
}
