package shootingGame;

import javax.swing.*;
import java.awt.*;

public class LeavingMessage extends JDialog {

    private static final Color backgroundColor = new Color(153, 153, 153);
    private static final JLabel infoText = new JLabel();

    public LeavingMessage(final int WIDTH,
                          final int HEIGHT) {
        setInfoTextProperties();
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setBackground(backgroundColor);
        setUndecorated(true);
        add(infoText);
        setVisible(false);
    }

    private void setInfoTextProperties() {
        infoText.setSize(400, 200);
        infoText.setLocation(50, 0);
        infoText.setText("Do you want leave the game?");
        infoText.setBackground(backgroundColor);
        infoText.setForeground(new Color(0, 0, 0));
        infoText.setBorder(null);
        infoText.setVisible(true);
    }
}
