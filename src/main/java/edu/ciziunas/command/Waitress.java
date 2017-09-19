package edu.ciziunas.command;

/**
 * Invoker object, so that you can set any kind of command(order)
 */
public class Waitress {

    private Order order;

    public void setOrder(Order order) {
        this.order = order;
    }

    public void orderUp() {
        order.make();
    }
}
