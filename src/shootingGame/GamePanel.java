package shootingGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePanel extends JPanel{

    private final static Color color =
            new Color(0, 0, 0);
    private final static int yPos = 600;
    private static int xPos = 360;
    private boolean isSpaceClicked = false;
    private boolean isArrowClicked = false;
    private boolean ifJPanelInits = true;
    private final int gameWindowWidth;

    public GamePanel (final int width,
                      final int height) {
        this.gameWindowWidth = width;
        setSize(width, height);
        setLocation(0,0);
        setFocusable(true);
        setVisible(true);
        setBackground(color);
        initKeyBinding();
    }

    private void initKeyBinding() {
        getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(0x25, 0), "leftArrow");
        getActionMap().put("leftArrow", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isArrowClicked = !isArrowClicked;
                if(xPos == 0)
                    xPos = gameWindowWidth - 10;
                else
                    xPos -= 10;
                validate();
                repaint();
            }
        });

        getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(0x27, 0), "rightArrow");
        getActionMap().put("rightArrow", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isArrowClicked = !isArrowClicked;
                if(xPos == gameWindowWidth)
                    xPos = 10;
                else
                    xPos += 10;
                validate();
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics gs) {
        Graphics2D g = (Graphics2D)gs;
        super.paintComponent(g);
        if(ifJPanelInits) {
            g.drawImage(ResourcesInjector.spaceship, xPos, yPos, null);
            ifJPanelInits = false;
        } else if(isArrowClicked){
            g.drawImage(ResourcesInjector.spaceship, xPos, yPos, null);
            isArrowClicked = false;
        }
    }
}
