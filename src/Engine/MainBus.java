package Engine;

/**
 * Created by m on 3/16/17.
 */
public class MainBus {

    static MyWindow window;

    public static void startAll() {
        startWindow();
        startGraphics();

        loop();
    }

    public static void startWindow() {
        try {
            window = new MyWindow(640);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void startGraphics() {
        try {
            Graphics.init(window);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void loop() {
        float time = System.nanoTime();
        float time2;
        float nanosecondsPerFrame = 1000000000/30;

        while(Resources.isRunning) {
            time2 = System.nanoTime();

            if(time2 - time >= nanosecondsPerFrame) {
                time = System.nanoTime();

                if(!Resources.isPaused) Logic.update();
                Graphics.draw();
            }
        }
    }
}
