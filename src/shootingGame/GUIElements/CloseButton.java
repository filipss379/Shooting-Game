package shootingGame.GUIElements;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CloseButton extends JButton {

    private static String closeText;
    private static Color backgroundNoActionColor;
    private static Color backgroundMouseEnteredColor;
    private static Color foregroundColor;
    private static Font font;

    static {
        closeText = "Exit";
        backgroundNoActionColor = new Color(198, 64, 64);
        backgroundMouseEnteredColor= new Color(122, 33, 33);
        foregroundColor = new Color(51, 51, 51);
        font = new Font("Dialog", Font.BOLD, 50);
    }

    public CloseButton (final int xPos,
                        final int yPos,
                        final int width,
                        final int height) {
        setSize(width, height);
        setLocation(xPos, yPos);
        setText(closeText);
        setFont(font);
        setBackground(backgroundNoActionColor);
        setForeground(foregroundColor);
        setVisible(true);
        setBorderPainted(false);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(1);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(backgroundMouseEnteredColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(backgroundNoActionColor);
            }
        });
    }
}