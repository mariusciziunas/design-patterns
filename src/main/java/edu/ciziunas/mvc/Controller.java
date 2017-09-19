package edu.ciziunas.mvc;

public class Controller implements ControllerInterface {

    private TvModelInterface model;
    private Screen touchScreen;

    public Controller(TvModelInterface model) {
        this.touchScreen = new TouchScreen(this);
        this.model = model;
        this.model.registerObserver(this.touchScreen);
    }

    @Override
    public void changeChannel(String channel) {
        System.out.println("Controller is changing channel to " + channel);
        model.changeChannel(channel);
    }

    @Override
    public void volumeUp() {
        System.out.println("Controller is increasing volume");
        model.setVolume(model.getVolume() + 1);
    }

}
