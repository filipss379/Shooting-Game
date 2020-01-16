package shootingGame.Gameplay;

import shootingGame.Injectors.GameComponentsInjector;

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
        GameComponentsInjector.getGamePanel().getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke("SPACE"), "space");
        GameComponentsInjector.getGamePanel().getActionMap().put("space", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ShootingController.releaseTheBullet();
            }
        });
    }

    private void initMovingLeftKey() {
        GameComponentsInjector.getGamePanel().getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(0x25, 0), "leftArrow");
        GameComponentsInjector.getGamePanel().getActionMap().put("leftArrow", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
               PlaneMovingController.movingLeft();
            }
        });
    }

    private void initMovingRightKey() {
        GameComponentsInjector.getGamePanel().getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(0x27, 0), "rightArrow");
        GameComponentsInjector.getGamePanel().getActionMap().put("rightArrow", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
               PlaneMovingController.movingRight();
            }
        });
    }


    private void pauseTheGame() {
        GameComponentsInjector.getGamePanel().getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(0x1B, 0), "escape");
        GameComponentsInjector.getGamePanel().getActionMap().put("escape", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameStatusController.stopTheGame();
                GameComponentsInjector.setLeaveMessage();
            }
        });
    }

}
