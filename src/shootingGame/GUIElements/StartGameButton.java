package shootingGame.GUIElements;

import shootingGame.GamePanel;
import shootingGame.InitWindow;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StartGameButton extends JButton {

    private static String closeText = "Start Game";

    public StartGameButton (final int xPos,
                            final int yPos,
                            final int width,
                            final int height) {
        setSize(width, height);
        setLocation(xPos, yPos);
        setText(closeText);
        setVisible(true);
        setBorderPainted(false);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    InitWindow.getGameWindow().getContentPane().removeAll();
                    InitWindow.getGameWindow().add(new GamePanel(800, 768));
                    InitWindow.getGameWindow().repaint();
                } catch(NullPointerException ex) {
                    System.err.println("Exception at start game " + ex);
                }
            }
        });
    }
}
