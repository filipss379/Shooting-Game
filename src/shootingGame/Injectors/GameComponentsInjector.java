package shootingGame.Injectors;

import shootingGame.GameComponents.GamePanel;
import shootingGame.GameComponents.MenuPanel;
import shootingGame.GameComponents.Message;
import shootingGame.WindowInitializer;

public class GameComponentsInjector {

    private static MenuPanel menuPanel;
    private static GamePanel gamePanel;
    private static Message message;
    private static int PANELS_WIDTH = 1024;
    private static int PANELS_HEIGHT = 768;
    private static int MESSAGE_WIDTH = 500;
    private static int MESSAGE_HEIGHT = 300;

    public static void initMenuPanel() {
        menuPanel = new MenuPanel(PANELS_WIDTH, PANELS_HEIGHT);
        gamePanel = new GamePanel(PANELS_WIDTH, PANELS_HEIGHT);
        message = new Message(MESSAGE_WIDTH, MESSAGE_HEIGHT);
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

    public static void setEndTheGameMessage() {
        try {
            message.setMessageComponents("End");
            message.setVisible(true);
        } catch(NullPointerException ex) {
            System.out.println("Exception while adding popup panel " + ex);
        }
    }

    public static void setLeaveMessage() {
        try {
            message.setMessageComponents("Pause");
            message.setVisible(true);
        } catch(NullPointerException ex) {
            System.out.println("Exception while adding popup panel " + ex);
        }
    }

    public static void setStartMessage() {
        try {
            message.setMessageComponents("Start");
            message.setVisible(true);
        } catch(NullPointerException ex) {
            System.out.println("Exception while adding popup panel " + ex);
        }
    }

    public static void removeMessage() {
        try {
            message.remove(ButtonsInjector.getOKButton());
            message.remove(ButtonsInjector.getReturnToMenuButton());
            message.remove(ButtonsInjector.getReturnToGameButton());
            message.remove(message.getPlayerName());
            message.setVisible(false);
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
