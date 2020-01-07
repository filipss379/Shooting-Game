package shootingGame.Injectors;

import shootingGame.GamePanel;
import shootingGame.MenuPanel;
import shootingGame.WindowInitializer;

public class PanelsInjector {

    private static MenuPanel menuPanel;
    private static GamePanel gamePanel;
    private static int PANELS_WIDTH = 1024;
    private static int PANELS_HEIGHT = 768;


    public static void initMenuPanel() {
        menuPanel = new MenuPanel(PANELS_WIDTH, PANELS_HEIGHT);
        gamePanel = new GamePanel(PANELS_WIDTH, PANELS_HEIGHT);
    }

    public static void setGamePanel() {
        try {
            WindowInitializer.getGameWindow().getContentPane().removeAll();
            WindowInitializer.getGameWindow().add(gamePanel);
            WindowInitializer.getGameWindow().repaint();
        } catch (NullPointerException ex) {
            System.out.println("Exception while adding game panel " + ex);
        }
    }

    public static MenuPanel getMenuPanel() {
        return menuPanel;
    }

    public static GamePanel getGamePanel() {
        return gamePanel;
    }
}
