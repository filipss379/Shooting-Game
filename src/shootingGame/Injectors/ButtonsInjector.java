package shootingGame.Injectors;


import shootingGame.Buttons.*;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ButtonsInjector implements ButtonsValues {

    private static JButton[] buttons;

    public static void loadGUIComponents() {
        buttons = new JButton[5];
        buttons[0] = new CloseButton(
                MENU_BUTTON_X_POSITION, CLOSE_BUTTON_Y_POSITION, MENU_BUTTON_WIDTH, MENU_BUTTON_HEIGHT);
        buttons[1] = new StatisticsButton(
                MENU_BUTTON_X_POSITION, STATISTICS_BUTTON_Y_POSITION, MENU_BUTTON_WIDTH, MENU_BUTTON_HEIGHT);
        buttons[2] = new StartGameButton(
                MENU_BUTTON_X_POSITION, START_BUTTON_Y_POSITION, MENU_BUTTON_WIDTH, MENU_BUTTON_HEIGHT);
        buttons[3] = new ReturnToGameButton(
                RETURN_TO_GAME_BUTTON_X_POSITION, LEAVING_MESSAGE_BUTTON_Y_POSITION, LEAVING_MESSAGE_BUTTON_WIDTH, LEAVING_MESSAGE_BUTTON_HEIGHT);
        buttons[4] = new ReturnToMenuButton(
                RETURN_TO_MENU_BUTTON_X_POSITION, LEAVING_MESSAGE_BUTTON_Y_POSITION, LEAVING_MESSAGE_BUTTON_WIDTH, LEAVING_MESSAGE_BUTTON_HEIGHT);
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

    public static JButton getReturnToGameButton() {
        return buttons[3];
    }

    public static JButton getReturnToMenuButton() {
        return buttons[4];
    }
}
