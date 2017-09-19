package edu.ciziunas.facade;

/**
 * The logic for preparing environment is done by facade, so the client just invoke the method watchMovie() or stopMovie(),
 * grab a beer and enjoy the movie
 */
public class HomeTheaterFacade {

    private DvdPlayer dvdPlayer;
    private LedTv ledTv;

    public HomeTheaterFacade(DvdPlayer dvdPlayer, LedTv ledTv) {
        this.dvdPlayer = dvdPlayer;
        this.ledTv = ledTv;
    }

    /**
     * Prepares the environment for watching a movie
     */
    void watchMovie() {
        dvdPlayer.turnOn();
        ledTv.turnOn();
        ledTv.setOutput();
        dvdPlayer.play();
    }

    /**
     * Stops the movie
     */
    void stopMovie() {
        ledTv.turnOff();
        dvdPlayer.turnOff();
    }
}
