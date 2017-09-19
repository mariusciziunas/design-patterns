package edu.ciziunas.mvc;

import java.util.ArrayList;
import java.util.List;

/**
 * Model implements observer pattern to register views. Model sends updates to the views once the state of the channel is changed
 */
public class TvModel implements TvModelInterface {

    private List<Screen> modelObservers = new ArrayList<>();
    private String channel;
    private int volume;

    @Override
    public void changeChannel(String channel) {
        this.channel = channel;
        System.out.println("Channel changed to " + channel);
        notifyScreenChangeObservers();
    }

    @Override
    public String getChannel() {
        return this.channel;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume changed to " + this.volume);
    }

    @Override
    public void registerObserver(Screen screen) {
        this.modelObservers.add(screen);
    }

    @Override
    public void removeObserver(Screen screen) {
        this.modelObservers.remove(screen);
    }

    private void notifyScreenChangeObservers() {
        for (Screen screen : modelObservers) {
            screen.channelChanged(channel);
        }
    }
}
