package shootingGame.GameComponents;

import javax.swing.*;
import java.awt.*;

public class StatisticsLabel extends JLabel {

    private static final Color BACKGROUND_COLOR = new Color(130, 130, 130);
    private static final Color FOREGROUND_COLOR = new Color(0, 0, 0);

    public StatisticsLabel(final int WIDTH,
                           final int HEIGHT) {
        setLocation(200, 200);
        setSize(WIDTH, HEIGHT);
        setBackground(BACKGROUND_COLOR);
        setForeground(FOREGROUND_COLOR);
        setVisible(false);
    }
}
