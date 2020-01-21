package shootingGame.GameComponents;

import shootingGame.Injectors.ButtonsInjector;
import shootingGame.Injectors.GameComponentsInjector;
import shootingGame.Injectors.ResourcesInjector;

import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {

    public MenuPanel (final int WIDTH,
                      final int HEIGHT) {
        setSize(WIDTH, HEIGHT);
        setLayout(null);
        setVisible(true);
        addButtonsToPanel();
        addStatisticsLabel();
    }

    private void addButtonsToPanel() {
        try {
            add(ButtonsInjector.getStartGameButton());
            add(ButtonsInjector.getStatisticsButton());
            add(ButtonsInjector.getCloseButton());
            add(ButtonsInjector.getGoToMenuFromStatisticsButton());
        } catch(NullPointerException ex) {
            System.out.println("Exception while adding buttons " + ex);
        }
    }

    private void addStatisticsLabel() {
        try {
            add(GameComponentsInjector.getStatisticsTextArea());
        } catch(NullPointerException ex) {
            System.out.println("Exception while adding statistics label" + ex);
        }
    }

    @Override
    protected void paintComponent(Graphics gs) {
        Graphics2D g = (Graphics2D) gs;
        super.paintComponent(g);
        g.drawImage(ResourcesInjector.menuBackgroundImage,0, 0, null);
    }
}


