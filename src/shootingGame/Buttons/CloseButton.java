package shootingGame.Buttons;


import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CloseButton extends JButton {

    private static String BUTTON_TEXT = "Exit";


    public CloseButton (final int X_BUTTON_POSITION,
                        final int Y_BUTTON_POSITION,
                        final int WIDTH,
                        final int HEIGHT) {
        setSize(WIDTH, HEIGHT);
        setLocation(X_BUTTON_POSITION, Y_BUTTON_POSITION);
        setText(BUTTON_TEXT);
        setVisible(true);
        setBorderPainted(false);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(1);
            }
        });
    }
}