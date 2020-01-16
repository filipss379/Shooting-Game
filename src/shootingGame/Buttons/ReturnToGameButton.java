package shootingGame.Buttons;

import shootingGame.Gameplay.GameStatusController;
import shootingGame.Injectors.GameComponentsInjector;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ReturnToGameButton extends JButton {

    private static final String BUTTON_TEXT = "Return To Game";

    public ReturnToGameButton(final int X_BUTTON_POSITION,
                              final int Y_BUTTON_POSITION,
                              final int WIDTH,
                              final int HEIGHT) {
        setSize(WIDTH, HEIGHT);
        setLocation(X_BUTTON_POSITION, Y_BUTTON_POSITION);
        setText(BUTTON_TEXT);
        setVisible(true);
        setBorderPainted(false);
        returnToGame();
    }

    private void returnToGame() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                GameComponentsInjector.removeMessage();
                GameStatusController.resumeTheGame();
            }
        });
    }
}
