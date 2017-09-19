package edu.ciziunas.proxy.virtual;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * The client of image proxy.
 * The client asks to display the icon downloaded from internet. The text 'loading' is displayed until the image is donwloaded from the internet.
 */
public class TestImageProxy {

    public static void main(String[] args) throws MalformedURLException {
        Icon image = new IconProxy(new URL("http://www.google.com/funny-picture-with-a-cat"));
        image.paintIcon();
    }
}
