package shootingGame.Injectors;


import shootingGame.Buttons.CloseButton;
import shootingGame.Buttons.StartGameButton;
import shootingGame.Buttons.StatisticsButton;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ButtonsInjector implements ButtonsValues {

    private static JButton[] buttons;

    public static void loadGUIComponents() {
        buttons = new JButton[3];
        buttons[0] = new CloseButton(
                BUTTON_X_POSITION, CLOSE_BUTTON_Y_POSITION, WIDTH, HEIGHT);
        buttons[1] = new StatisticsButton(
                BUTTON_X_POSITION, STATISTICS_BUTTON_Y_POSITION, WIDTH, HEIGHT);
        buttons[2] = new StartGameButton(
                BUTTON_X_POSITION, START_BUTTON_Y_POSITION, WIDTH, HEIGHT);
        setCommonValues();
    }

    private static void setCommonValues() {
        try {
            for(JButton button : buttons) {
                button.setBackground(BACKGROUND_NO_ACTION_COLOR);
                button.setForeground(FOREGROUND_COLOR);
                button.setFont(FONT);
                setButtonMouseListener(button);
            }
        } catch(NullPointerException ex) {
            System.err.println(
                    "Exception while setting button common values " + ex);
        }
    }

    private static void setButtonMouseListener(JButton button) {
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(BACKGROUND_MOUSE_ENTERED_COLOR);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(BACKGROUND_NO_ACTION_COLOR);
            }
        });
    }

    public static JButton getCloseButton() {
        return buttons[0];
    }

    public static JButton getStatisticsButton() {
        return buttons[1];
    }

    public static JButton getStartGameButton() {
        return buttons[2];
    }
}
