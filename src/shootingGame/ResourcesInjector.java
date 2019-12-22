package shootingGame;

import javax.swing.*;
import java.awt.*;

public class ResourcesInjector {

    public static Image backgroundImage;

    public static void loadInitialResources() {
        backgroundImage = loadImage("images/background-image.jpg");
    }

    private static Image loadImage(String fileName) {
        return new ImageIcon(fileName).getImage();
    }
}
