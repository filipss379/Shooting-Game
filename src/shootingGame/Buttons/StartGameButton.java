package shootingGame.Buttons;

import shootingGame.Injectors.GameComponentsInjector;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StartGameButton extends JButton {

    private static final String BUTTON_TEXT = "Start Game";

    public StartGameButton (final int X_BUTTON_POSITION,
                            final int Y_BUTTON_POSITION,
                            final int WIDTH,
                            final int HEIGHT) {
        setSize(WIDTH, HEIGHT);
        setLocation(X_BUTTON_POSITION, Y_BUTTON_POSITION);
        setText(BUTTON_TEXT);
        setVisible(true);
        setBorderPainted(false);
        changePanels();
    }

    private void changePanels() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                GameComponentsInjector.setGamePanel();
                startTheGame();
            }
        });
    }

    private void startTheGame() {
        GameComponentsInjector.setGamePanel();
        GameComponentsInjector.setStartMessage();
    }
}
