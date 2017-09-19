package edu.ciziunas.strategy;

/**
 * A drawer implementation which can draw different shapes. The shape passed to the painter will be drawn.
 */
public class TestDrawing {

    public static void main(String[] args) {

        Painter painter = new Painter();
        Rectangular rectangular = new Rectangular();
        painter.drawShape(rectangular);

        Triangle triangle = new Triangle();
        painter.drawShape(triangle);

    }
}
