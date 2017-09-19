package edu.ciziunas.proxy.virtual;

import javax.swing.*;
import java.net.URL;

/**
 * The proxy between actual icon and temp 'loading' text
 * The class is not fully implemented. The async stuff is left because this is not in the scope
 */
public class IconProxy implements Icon {

    private URL imageUrl;
    private ImageIcon imageIcon;

    public IconProxy(URL imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public void paintIcon() {
        // set the text while the real image is downloaded
        System.out.println("Loading CD cover, please wait...");

        // do async stuff to get the real image
        imageIcon = new ImageIcon(imageUrl, "CD Cover");
    }
}
