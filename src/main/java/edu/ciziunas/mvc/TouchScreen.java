package edu.ciziunas.mvc;

/**
 * This is user interface implementation
 */
public class TouchScreen implements Screen {

    private ControllerInterface controller;

    public TouchScreen(ControllerInterface controller) {
        this.controller = controller;
    }

    @Override
    public void changeChannel(String channel) {
        System.out.println("User changed channel to " + channel);
        controller.changeChannel(channel);
    }

    @Override
    public void volumeUp() {
        System.out.println("User increased a volume");
        controller.volumeUp();
    }

    @Override
    public void channelChanged(String channel) {
        System.out.println("Channel in the view is changed to " + channel);
    }


}
