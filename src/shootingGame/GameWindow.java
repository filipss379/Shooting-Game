package shootingGame;

import shootingGame.Injectors.GameComponentsInjector;
import javax.swing.*;

public class GameWindow extends JFrame {

    public GameWindow (final int X_GAME_WINDOW_POSITION,
                       final int Y_GAME_WINDOW_POSITION,
                       final int WIDTH,
                       final int HEIGHT) {
        super();
        setSize(WIDTH, HEIGHT);
        setLocation(X_GAME_WINDOW_POSITION, Y_GAME_WINDOW_POSITION);
        setResizable(false);
        setUndecorated(true);
        requestFocusInWindow();
        setVisible(true);
        add(GameComponentsInjector.getMenuPanel());
    }
}
