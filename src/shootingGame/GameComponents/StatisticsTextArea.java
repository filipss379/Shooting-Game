package shootingGame.GameComponents;

import javax.swing.*;
import java.awt.*;

public class StatisticsTextArea extends JTextArea {

    private static final Color BACKGROUND_COLOR = new Color(130, 130, 130);
    private static final Color FOREGROUND_COLOR = new Color(35, 35, 35);
    private static final Font STATISTICS_FONT = new Font("Italic", Font.BOLD, 16);


    public StatisticsTextArea(final int WIDTH,
                              final int HEIGHT) {
        setLocation(312, 134);
        setSize(WIDTH, HEIGHT);
        setBackground(BACKGROUND_COLOR);
        setForeground(FOREGROUND_COLOR);
        setFont(STATISTICS_FONT);
        setBorder(null);
        setOpaque(true);
        setEditable(false);
        setVisible(false);
    }
}
