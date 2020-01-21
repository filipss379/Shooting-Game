package shootingGame.Injectors;


import shootingGame.Buttons.*;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ButtonsInjector implements ButtonsValues {

    private static JButton[] buttons;

    public static void loadButtons() {
        buttons = new JButton[7];
        buttons[0] = new CloseButton(
                MENU_BUTTON_X_POSITION, CLOSE_BUTTON_Y_POSITION, MENU_BUTTON_WIDTH, MENU_BUTTON_HEIGHT);
        buttons[1] = new StatisticsButton(
                MENU_BUTTON_X_POSITION, STATISTICS_BUTTON_Y_POSITION, MENU_BUTTON_WIDTH, MENU_BUTTON_HEIGHT);
        buttons[2] = new StartGameButton(
                MENU_BUTTON_X_POSITION, START_BUTTON_Y_POSITION, MENU_BUTTON_WIDTH, MENU_BUTTON_HEIGHT);
        buttons[3] = new ReturnToGameButton(
                RETURN_TO_GAME_BUTTON_X_POSITION, MESSAGE_BUTTON_Y_POSITION, MESSAGE_BUTTON_WIDTH, MESSAGE_BUTTON_HEIGHT);
        buttons[4] = new ReturnToMenuButton(
                RETURN_TO_MENU_BUTTON_X_POSITION, MESSAGE_BUTTON_Y_POSITION, MESSAGE_BUTTON_WIDTH, MESSAGE_BUTTON_HEIGHT);
        buttons[5] = new OKMessageButton(
                OK_BUTTON_X_POSITION, MESSAGE_BUTTON_Y_POSITION, MESSAGE_BUTTON_WIDTH, MESSAGE_BUTTON_HEIGHT);
        buttons[6] = new GoToMenuFromStatisticsButton(
                GO_TO_MENU_FROM_STATISTICS_BUTTON_X_POSITION, GO_TO_MENU_FROM_STATISTICS_BUTTON_Y_POSITION,
                GO_TO_MENU_FROM_STATISTICS_BUTTON_WIDTH, GO_TO_MENU_FROM_STATISTICS_BUTTON_HEIGHT);
        setButtonsCommonValues();
    }

    private static void setButtonsCommonValues() {
        try {
            for(JButton button : buttons) {
                button.setBackground(BACKGROUND_NO_ACTION_COLOR);
                button.setForeground(FOREGROUND_COLOR);
                button.setFont(FONT);
                setButtonHoverAction(button);
            }
        } catch(NullPointerException ex) {
            System.out.println("Exception while setting button common values " + ex);
        }
    }

    private static void setButtonHoverAction(JButton button) {
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

    public static JButton getOKButton() {
        return buttons[5];
    }

    public static JButton getGoToMenuFromStatisticsButton() {
        return buttons[6];
    }
}
