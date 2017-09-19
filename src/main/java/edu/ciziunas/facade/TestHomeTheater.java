package edu.ciziunas.facade;

public class TestHomeTheater {

    /**
     * A facade provides a simple interface for a client to watch a movie. Prerequisites are TV and DVD player.
     * Once you pass these two to the facade - it will take care the the logic behind and just play the movie.
     * @param args
     */
    public static void main(String[] args) {
        DvdPlayer dvdPlayer = new DvdPlayer();
        LedTv ledTv = new LedTv();

        HomeTheaterFacade facade = new HomeTheaterFacade(dvdPlayer, ledTv);
        facade.watchMovie();

        facade.stopMovie();
    }
}
