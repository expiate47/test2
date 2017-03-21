package Engine;

import javax.swing.*;
import java.awt.*;

/**
 * Created by m on 3/16/17.
 */
public class MyWindow extends Canvas implements Bussable{

    private int width;
    private int height;

    public MyWindow(int width) {
        this.width = width;
        this.height = width / 2;
        Resources.windowWidth = this.width;
        Resources.windowHeight = this.height;

        JFrame frame = new JFrame();

        setFocusable(true);
        setPreferredSize(new Dimension(this.width, height));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);

        createBufferStrategy(2);
    }
}
