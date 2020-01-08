package shootingGame;

import shootingGame.Injectors.ButtonsInjector;
import shootingGame.Injectors.ResourcesInjector;

import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {

    public MenuPanel (final int WIDTH,
                      final int HEIGHT) {
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        addButtonsToPanel();
    }

    private void addButtonsToPanel() {
        try {
            add(ButtonsInjector.getStartGameButton());
            add(ButtonsInjector.getStatisticsButton());
            add(ButtonsInjector.getCloseButton());
        } catch(NullPointerException ex) {
            System.err.println("Exception while adding buttons " + ex);
        }
    }

    @Override
    protected void paintComponent(Graphics gs) {
        Graphics2D g = (Graphics2D) gs;
        super.paintComponent(g);
        g.drawImage(ResourcesInjector.menuBackgroundImage,0, 0, null);
    }
}


