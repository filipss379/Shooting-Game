package shootingGame.Buttons;

import shootingGame.Injectors.GameComponentsInjector;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GoToMenuFromStatisticsButton extends JButton {

    private static final String BUTTON_TEXT = "Return To Menu";

    public GoToMenuFromStatisticsButton(final int X_BUTTON_POSITION,
                                        final int Y_BUTTON_POSITION,
                                        final int WIDTH,
                                        final int HEIGHT) {
        setSize(WIDTH, HEIGHT);
        setLocation(X_BUTTON_POSITION, Y_BUTTON_POSITION);
        setText(BUTTON_TEXT);
        setVisible(false);
        setBorderPainted(false);
        returnToMenu();
    }

    private void returnToMenu() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                GameComponentsInjector.removeStatisticsTextArea();
            }
        });
    }
}
