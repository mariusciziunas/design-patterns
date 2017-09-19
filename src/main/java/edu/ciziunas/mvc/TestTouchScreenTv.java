package edu.ciziunas.mvc;

/**
 * MVC - Model, View, Controller.
 * Screen is a view
 * TvModel - model
 * ControllerInterface - controller
 *
 * Controller is a connecting piece between model and a view.
 * User gives an input on a touch screen, which is the view. Then the view invokes a method in a controller, which then invokes the state change for model.
 * A view registers itself to a model, so that model would send updates after a state change. And that is a circle. View triggers controller,
 * controller triggers model and model sends update to a view. Afterwards view waits for another user input.
 *
 * The above phrases:
 * "View registered itself to a model" stands for observer pattern implementation. Many views can register to a single model.
 * "View invokes a method in a controller" is a strategy pattern. A view can have multiple controller implementations(strategies)
 */
public class TestTouchScreenTv {

    /**
     * Testing touchscreen input
     * @param args
     */
    public static void main(String[] args) {

     TvModelInterface model = new TvModel();
     ControllerInterface controller = new Controller(model);
     Screen view = new TouchScreen(controller);

     view.changeChannel("BBC");
     view.volumeUp();
     view.changeChannel("SKY sport 1");

    }
}
