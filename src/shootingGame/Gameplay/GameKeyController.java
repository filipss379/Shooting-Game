package shootingGame.Gameplay;

import shootingGame.Injectors.PanelsInjector;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class GameKeyController extends GameProperties {


    public void initGameKeyBinding() {
        initMovingLeft();
        initMovingRight();
        initShooting();
    }

    private void initShooting() {
        PanelsInjector.getGamePanel().getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke("SPACE"), "space");
        PanelsInjector.getGamePanel().getActionMap().put("space", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!isAlreadyShooting)
                    bulletReleased = true;
            }
        });
    }

    private void initMovingLeft() {
        PanelsInjector.getGamePanel().getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(0x25, 0), "leftArrow");
        PanelsInjector.getGamePanel().getActionMap().put("leftArrow", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
               movingLeft();
            }
        });
    }

    private void movingLeft() {
        if(xPlanePosition <= (0 - PLANE_IMAGE_WIDTH /2))
            xPlanePosition = GAME_WINDOW_WIDTH - PLANE_IMAGE_WIDTH /2;
        else
            xPlanePosition -= DifficultyController.getPlaneMovingStep();
    }

    private void initMovingRight() {
        PanelsInjector.getGamePanel().getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(0x27, 0), "rightArrow");
        PanelsInjector.getGamePanel().getActionMap().put("rightArrow", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
               movingRight();
            }
        });
    }

    private void movingRight() {
        if(xPlanePosition >= GAME_WINDOW_WIDTH - PLANE_IMAGE_WIDTH /2)
            xPlanePosition = -PLANE_IMAGE_WIDTH /2;
        else
            xPlanePosition += DifficultyController.getPlaneMovingStep();
    }

//    private void pauseTheGame() {
//        PanelsInjector.getGamePanel().getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW)
//                .put(KeyStroke.getKeyStroke(0x1B, 0), "escape");
//        PanelsInjector.getGamePanel().getActionMap().put("escape", new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("ESCAPE");
//            }
//        });
//    }

}
