package shootingGame.Injectors;

import shootingGame.Gameplay.GamePanel;
import shootingGame.MenuPanel;
import shootingGame.WindowInitializer;

public class PanelsInjector {

    private static MenuPanel menuPanel;
    private static GamePanel gamePanel;
    private static int MENU_PANEL_WIDTH = 1024;
    private static int GAME_PANEL_WIDTH = 800;
    private static int PANELS_HEIGHT = 768;


    public static void initMenuPanel() {
        menuPanel = new MenuPanel(MENU_PANEL_WIDTH, PANELS_HEIGHT);
        gamePanel = new GamePanel(GAME_PANEL_WIDTH, PANELS_HEIGHT);
    }

    public static void setGamePanel() {
        try {
            WindowInitializer.getGameWindow().getContentPane().removeAll();
            WindowInitializer.getGameWindow().add(gamePanel);
            WindowInitializer.getGameWindow().repaint();
            gamePanel.startTheGame();
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
