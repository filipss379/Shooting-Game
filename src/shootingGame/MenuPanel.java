package shootingGame;

import shootingGame.GUIElements.ButtonsInjector;

import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {

    public MenuPanel (final int width,
                      final int height) {
        setSize(width, height);
        setVisible(true);
        add(ButtonsInjector.getCloseButton());
    }

    @Override
    protected void paintComponent(Graphics gs) {
        Graphics2D g = (Graphics2D)gs;
        g.drawImage(ResourcesInjector.backgroundImage,
                0, 0, null);
    }
}


