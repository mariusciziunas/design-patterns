package edu.ciziunas.strategy;

/**
 * This is called a context. This class does not depend on implementation of the shape.
 * It invokes an actual algorithm.
 */
public class Painter {

    public void drawShape(Shape shape) {
        shape.draw();
    }
}
