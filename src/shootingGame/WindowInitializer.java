package shootingGame;

import shootingGame.GameComponents.GameWindow;
import shootingGame.Injectors.ButtonsInjector;
import shootingGame.Injectors.GameComponentsInjector;
import shootingGame.Injectors.ResourcesInjector;

import java.awt.*;

public class WindowInitializer {

    private static final int SCREEN_WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;
    private static final int SCREEN_HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;
    private static final int GAME_WIDTH = 1024;
    private static final int GAME_HEIGHT = 768;
    private static final int X_GAME_WINDOW_POSITION = (SCREEN_WIDTH - GAME_WIDTH)/2;
    private static final int Y_GAME_WINDOW_POSITION = (SCREEN_HEIGHT - GAME_HEIGHT)/2;
    private static GameWindow gameWindow;

    public WindowInitializer() {
        loadResources();
        gameWindow = new GameWindow(
                X_GAME_WINDOW_POSITION, Y_GAME_WINDOW_POSITION, GAME_WIDTH, GAME_HEIGHT);
    }

    private void loadResources() {
        ResourcesInjector.loadInitialResources();
        ButtonsInjector.loadGUIComponents();
        GameComponentsInjector.initGameComponents();
    }

    public static GameWindow getGameWindow() {
        return gameWindow;
    }
}
