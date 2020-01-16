package shootingGame.Buttons;

import shootingGame.Gameplay.GameProperties;
import shootingGame.Gameplay.GameStatusController;
import shootingGame.Gameplay.Gameplay;
import shootingGame.Injectors.GameComponentsInjector;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OKMessageButton extends JButton {

    private static final String BUTTON_TEXT = "OK";
    private static Gameplay gameplay;

    public OKMessageButton(final int X_BUTTON_POSITION,
                           final int Y_BUTTON_POSITION,
                           final int WIDTH,
                           final int HEIGHT) {
        setSize(WIDTH, HEIGHT);
        setLocation(X_BUTTON_POSITION, Y_BUTTON_POSITION);
        setText(BUTTON_TEXT);
        setVisible(true);
        setBorderPainted(false);
        setClickAction();
    }

    private void setClickAction() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                GameComponentsInjector.removeMessage();
                startTheGame();
            }
        });
    }

    private void startTheGame() {
        if(!GameProperties.isThreadInitilized)
            gameplay = new Gameplay();
        GameStatusController.startTheGame();
    }
}
