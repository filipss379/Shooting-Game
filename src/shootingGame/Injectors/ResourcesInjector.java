package shootingGame.Injectors;

import javax.swing.*;
import java.awt.*;

public class ResourcesInjector {

    public static Image menuBackgroundImage;
    public static Image plane;
    public static Image bomb;
    public static Image bullet;

    public static void loadInitialResources() {
        menuBackgroundImage = loadImage("images/background-image.jpg");
        plane = loadImage("images/plane.jpg");
        bomb = loadImage("images/bomb.png");
        bullet = loadImage("images/bullet.png");
    }

    private static Image loadImage(String fileName) {
        return new ImageIcon(fileName).getImage();
    }
}
