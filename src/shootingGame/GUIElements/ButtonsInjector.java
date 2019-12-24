package shootingGame.GUIElements;


import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ButtonsInjector implements ButtonsCommonValues {

    private static JButton[] buttons;

    public static void loadGUIComponents() {
        buttons = new JButton[3];
        buttons[0] = new CloseButton(
                100, 450, 300, 100);
        buttons[1] = new StatisticsButton(
                100, 300, 300, 100);
        buttons[2] = new StartGameButton(
                100, 150, 300, 100);
        setCommonValues();
    }

    private static void setCommonValues() {
        try {
            for(final JButton button : buttons) {
                button.setBackground(backgroundNoActionColor);
                button.setForeground(foregroundColor);
                button.setFont(font);

                button.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        button.setBackground(backgroundMouseEnteredColor);
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        button.setBackground(backgroundNoActionColor);
                    }
                });
            }

        } catch(NullPointerException ex) {
            System.err.println(
                    "Exception while setting button common valules " + ex);
        }
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
