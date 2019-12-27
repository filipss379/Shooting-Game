package shootingGame;

import java.awt.*;

public class InitWindow {

    private static final int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
    private static final int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
    private static final int gameWidth = 1024;
    private static final int gameHeight = 768;
    private static final int xPos = (screenWidth - gameWidth)/2;
    private static final int yPos = (screenHeight - gameHeight)/2;
    private static GameWindow gameWindow;

    public InitWindow() {
        gameWindow = new GameWindow(
                xPos, yPos, gameWidth, gameHeight);
    }

    public static GameWindow getGameWindow() {
        try {
            return gameWindow;
        } catch(NullPointerException ex) {
            System.err.println("Excetpions at getGameWindow" + ex);
            return null;
        }
    }
}
