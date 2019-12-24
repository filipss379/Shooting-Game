package shootingGame;

import shootingGame.GUIElements.ButtonsInjector;

import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {

    public MenuPanel (final int width,
                      final int height) {
        setSize(width, height);
        setVisible(true);
        try {
            add(ButtonsInjector.getStartGameButton());
            add(ButtonsInjector.getStatisticsButton());
            add(ButtonsInjector.getCloseButton());
        } catch(NullPointerException ex) {
            System.err.println("Wyjatek " + ex);
        }
    }

    @Override
    protected void paintComponent(Graphics gs) {
        gs.drawImage(ResourcesInjector.backgroundImage,
                0, 0, null);
    }
}


