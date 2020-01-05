package shootingGame.Buttons;

import shootingGame.Injectors.ButtonsInjector;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StatisticsButton extends JButton {

    private static String statisticsText  = "Statistics";

    public StatisticsButton (final int X_BUTTON_POSITION,
                             final int Y_BUTTON_POSITION,
                             final int WIDTH,
                             final int HEIGHT) {
        setSize(WIDTH, HEIGHT);
        setLocation(X_BUTTON_POSITION, Y_BUTTON_POSITION);
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
