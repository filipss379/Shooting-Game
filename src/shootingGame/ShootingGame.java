package shootingGame;


import java.awt.Toolkit;

public class ShootingGame {

    public static void main(String []args) {

        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;

        int gameWidth = 1024;
        int gameHeight = 768;

        int xPos = (screenWidth - gameWidth)/2;
        int yPos = (screenHeight - gameHeight)/2;

        GameWindow newGame = new GameWindow(xPos, yPos, gameWidth, gameHeight);

    }
}
