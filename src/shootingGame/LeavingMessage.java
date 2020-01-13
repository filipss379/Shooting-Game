package shootingGame;

import shootingGame.Injectors.ButtonsInjector;
import shootingGame.Injectors.GameComponentsInjector;

import javax.swing.*;
import java.awt.*;


public class LeavingMessage extends JDialog {

    private static final Color backgroundColor = new Color(130, 130, 130);
    private static final JLabel infoText = new JLabel();

    public LeavingMessage(final int WIDTH,
                          final int HEIGHT) {
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(GameComponentsInjector.getGamePanel());
        setBackground(backgroundColor);
        setUndecorated(true);
        setLayout(null);
        add(infoText);
        add(ButtonsInjector.getReturnToGameButton());
        add(ButtonsInjector.getReturnToMenuButton());
        setInfoTextProperties();
        setVisible(false);
    }

    private void setInfoTextProperties() {
        infoText.setSize(380, 55);
        infoText.setLocation(60, 30);
        infoText.setFont(new Font("Italic", Font.BOLD, 25));
        infoText.setText("Do you want leave the game?");
        infoText.setBackground(backgroundColor);
        infoText.setForeground(new Color(35, 35, 35));
        infoText.setBorder(null);
        infoText.setVisible(true);
    }
}
