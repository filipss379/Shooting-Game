package shootingGame;

import shootingGame.GUIElements.ButtonsInjector;
import javax.swing.*;

public class GameWindow extends JFrame {

    public GameWindow (final int xPos,
                       final int yPos,
                       final int width,
                       final int height) {
        super();
        loadResources();
        setSize(width, height);
        setLocation(xPos, yPos);
        setResizable(false);
        setUndecorated(true);
        setVisible(true);
        add(new MenuPanel(width, height));
    }

    private void loadResources() {
        ButtonsInjector.loadGUIComponents();
        ResourcesInjector.loadInitialResources();
    }
}
