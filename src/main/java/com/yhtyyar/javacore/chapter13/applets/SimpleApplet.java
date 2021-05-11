package main.java.com.yhtyyar.javacore.chapter13.applets;

import java.applet.Applet;
import java.awt.*;

/*
<applet code="SimpleApplet" width="200" height="600">
</applet>
 */

public class SimpleApplet extends Applet {

    public void paint (Graphics g) {
        g.drawString("Простейший аплет", 20, 20);
    }
}
