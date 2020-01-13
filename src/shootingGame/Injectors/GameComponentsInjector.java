package shootingGame.Injectors;

import shootingGame.GamePanel;
import shootingGame.MenuPanel;
import shootingGame.LeavingMessage;
import shootingGame.WindowInitializer;

public class GameComponentsInjector {

    private static MenuPanel menuPanel;
    private static GamePanel gamePanel;
    private static LeavingMessage leavingMessage;
    private static int PANELS_WIDTH = 1024;
    private static int PANELS_HEIGHT = 768;
    private static int LEAVING_MESSAGE_WIDTH = 500;
    private static int LEAVING_MESSAGE_HEIGHT = 300;

    public static void initMenuPanel() {
        menuPanel = new MenuPanel(PANELS_WIDTH, PANELS_HEIGHT);
        gamePanel = new GamePanel(PANELS_WIDTH, PANELS_HEIGHT);
        leavingMessage = new LeavingMessage(LEAVING_MESSAGE_WIDTH, LEAVING_MESSAGE_HEIGHT);
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

    public static void setMenuPanel() {
        try {
            WindowInitializer.getGameWindow().getContentPane().removeAll();
            WindowInitializer.getGameWindow().add(menuPanel);
            WindowInitializer.getGameWindow().repaint();
        } catch (NullPointerException ex) {
            System.out.println("Exception while adding game panel " + ex);
        }
    }

    public static void setLeavingMessage() {
        try {
            leavingMessage.setVisible(true);
        } catch(NullPointerException ex) {
            System.out.println("Exception while adding popup panel " + ex);
        }
    }

    public static void removeLeavingMessage() {
        try {
            leavingMessage.setVisible(false);
        } catch (NullPointerException ex) {
            System.out.println("Exception while setting visible of JDialog to false" + ex);
        }
    }

    public static MenuPanel getMenuPanel() {
        return menuPanel;
    }

    public static GamePanel getGamePanel() {
        return gamePanel;
    }

}
