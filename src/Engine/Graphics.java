package Engine;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

/**
 * Created by m on 3/16/17.
 */
public class Graphics implements Bussable{

    static BufferStrategy bs;

    public static void init(MyWindow window) {
        bs = window.getBufferStrategy();
    }

    public static void draw() {
        Graphics2D g = (Graphics2D) bs.getDrawGraphics();

        g.setColor(new Color(150, 100, 50));
        g.fillRect(0, 0, Resources.windowWidth, Resources.windowHeight);
        g.dispose();

        bs.show();
    }
}
