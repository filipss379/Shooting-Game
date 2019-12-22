package shootingGame;

import shootingGame.GUIElements.ButtonsInjector;

import javax.swing.*;

public class MenuPanel extends JPanel {

    private static ButtonsInjector buttonsInjector;

    {
        buttonsInjector = new ButtonsInjector();
    }

    public MenuPanel (final int width,
                      final int height) {
        setSize(width, height);
        setVisible(true);
        add(buttonsInjector.getCloseButton());
    }
}


