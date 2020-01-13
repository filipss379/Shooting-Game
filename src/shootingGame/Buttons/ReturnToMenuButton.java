package shootingGame.Buttons;

import shootingGame.Injectors.GameComponentsInjector;

import javax.swing.*;
import java.awt.event.*;

public class ReturnToMenuButton extends JButton {

    private static final String BUTTON_TEXT = "Return To Menu";

    public ReturnToMenuButton(final int X_BUTTON_POSITION,
                              final int Y_BUTTON_POSITION,
                              final int WIDTH,
                              final int HEIGHT) {
        setSize(WIDTH, HEIGHT);
        setLocation(X_BUTTON_POSITION, Y_BUTTON_POSITION);
        setText(BUTTON_TEXT);
        setVisible(true);
        setBorderPainted(false);
        SaveTheScoreAndReturn();
    }

    private void SaveTheScoreAndReturn() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                GameComponentsInjector.removeMessage();
                GameComponentsInjector.setMenuPanel();
            }
        });
    }
}

