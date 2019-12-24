package shootingGame;

import javax.swing.*;
import java.awt.*;

public class ResourcesInjector {

    public static Image backgroundImage;
    public static Image spaceship;

    public static void loadInitialResources() {
        backgroundImage = loadImage("images/background-image.jpg");
        spaceship = loadImage("images/spaceship.jpg");
    }

    private static Image loadImage(String fileName) {
        return new ImageIcon(fileName).getImage();
    }
}
