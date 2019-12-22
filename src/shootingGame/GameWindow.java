package shootingGame;

import javax.swing.*;

public class GameWindow extends JFrame {

    public GameWindow (final int xPos,
                       final int yPos,
                       final int width,
                       final int height) {
        super();
        setSize(width, height);
        setLocation(xPos, yPos);
        setResizable(false);
        setUndecorated(true);
        setVisible(true);

        add(new MenuPanel(width, height));
    }
}
