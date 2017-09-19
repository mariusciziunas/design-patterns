package edu.ciziunas.mvc;

/**
 * Interface for model state management
 */
public interface TvModelInterface {

    void changeChannel(String channel);

    String getChannel();

    int getVolume();

    void setVolume(int volume);

    void registerObserver(Screen screen);

    void removeObserver(Screen screen);

}
