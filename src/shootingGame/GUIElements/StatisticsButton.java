package shootingGame.GUIElements;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StatisticsButton extends JButton {

    private static String statisticsText  = "Statistics";

    public StatisticsButton (final int xPos,
                             final int yPos,
                             final int width,
                             final int height) {
        setSize(width, height);
        setLocation(xPos, yPos);
        setText(statisticsText);
        setVisible(true);
        setBorderPainted(false);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                ButtonsInjector.getStartGameButton().setVisible(false);
                ButtonsInjector.getCloseButton().setVisible(false);
            }
        });
    }
}
