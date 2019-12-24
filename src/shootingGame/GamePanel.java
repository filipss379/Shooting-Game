package shootingGame;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    Color color = new Color(0,0,0);

    public GamePanel (final int width,
                      final int height) {
        setSize(width, height);
        setVisible(true);
        setBackground(color);
    }
}
