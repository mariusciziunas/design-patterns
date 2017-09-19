package edu.ciziunas.command;

/**
 * Has a reference to the invoker(waitress) and can set any kind of command(order)
 */
public class Client {

    private Waitress waitress;

    public Client(Waitress waitress) {
        this.waitress = waitress;
    }

    public void createOrder(Order order) {
        System.out.println("The waitress created the order");
        waitress.setOrder(order);
    }
}
