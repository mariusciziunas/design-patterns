package edu.ciziunas.template;

/**
 * The base class of the pie where the algorithm is defined in the 'final makePie' methon and the parts which varies are forwarded to subclasses
 */
public abstract class Pie {

    /**
     * algorithm of making a pie is implemented
     */
    public final void makePie() {
        prepareDough();
        addFilling();
        bake();
        addTopings();
    }

    /**
     * filling is the varying behaviour so it is implemented in subclasses
     */
    abstract void addFilling();

    /**
     * The dough in Ciziunas Bakery is always the same so it is even restricted to change it
     */
    final void prepareDough() {
        System.out.println("prepare dough");
    }

    void bake() {
        System.out.println("bake");
    }

    /**
     * This is optional, so it can be overridden in the subclass or just left empty.
     * This method is called a hook
     */
    void addTopings() {
    }

}
