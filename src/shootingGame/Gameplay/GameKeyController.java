package shootingGame.Gameplay;

import shootingGame.Injectors.PanelsInjector;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class GameKeyController extends GameProperties {


    public void initGameKeyBinding() {
        initMovingLeftKey();
        initMovingRightKey();
        initShootingKey();
        pauseTheGame();
    }

    private void initShootingKey() {
        PanelsInjector.getGamePanel().getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke("SPACE"), "space");
        PanelsInjector.getGamePanel().getActionMap().put("space", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ShootingController.releaseTheBullet();
            }
        });
    }

    private void initMovingLeftKey() {
        PanelsInjector.getGamePanel().getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(0x25, 0), "leftArrow");
        PanelsInjector.getGamePanel().getActionMap().put("leftArrow", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
               PlaneMovingController.movingLeft();
            }
        });
    }

    private void initMovingRightKey() {
        PanelsInjector.getGamePanel().getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(0x27, 0), "rightArrow");
        PanelsInjector.getGamePanel().getActionMap().put("rightArrow", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
               PlaneMovingController.movingRight();
            }
        });
    }


    private void pauseTheGame() {
        PanelsInjector.getGamePanel().getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(0x1B, 0), "escape");
        PanelsInjector.getGamePanel().getActionMap().put("escape", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ESCAPE");
                shouldWait = !shouldWait;
            }
        });
    }

}
