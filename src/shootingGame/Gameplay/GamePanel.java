package shootingGame.Gameplay;

import shootingGame.Injectors.ResourcesInjector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePanel extends JPanel {

    private static final Color GAME_BACKGROUND_COLOR = new Color(0, 0, 0);
    private final int GAME_WINDOW_WIDTH;
    private final int GAME_WINDOW_HEIGHT;


    public GamePanel (final int WIDTH,
                      final int HEIGHT) {
            this.GAME_WINDOW_WIDTH = WIDTH;
            this.GAME_WINDOW_HEIGHT = HEIGHT;
            GameStatus.xPlanePosition = (WIDTH - GameStatus.PLANE_IMAGE_WIDTH)/2;
            Y_BULLET_START_POSITION = Y_PLANE_POSITION - BULLET_IMAGE_HEIGHT;
            setSize(WIDTH, HEIGHT);
            setLocation(0,0);
            setVisible(true);
            setBackground(GAME_BACKGROUND_COLOR);
    }

    public void startTheGame() {
        initMovingLeft();
        initMovingRight();
        initShooting();
        bombMoving();
        checkIfCollision();
        pauseTheGame();
    }

    @Override
    protected void paintComponent(Graphics gs) {
        final Graphics2D g = (Graphics2D)gs;
        super.paintComponent(g);

        g.drawImage(ResourcesInjector.plane, xPlanePosition, Y_PLANE_POSITION, null);
        if(bombReleased)
            g.drawImage(ResourcesInjector.bomb, xBombPosition, yBombPosition, null);
        if(bulletReleased)
            g.drawImage(ResourcesInjector.bullet, xBulletPosition, yBulletPosition, null);
    }

    private void checkIfCollision(){
        new Thread(() -> {
            while(true){
                try {
                    Thread.sleep(30);
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                }
                if(((xBulletPosition <= (xBombPosition+BOMB_IMAGE_WIDTH)) &&
                  (xBulletPosition >= xBombPosition)) &&
                  ((yBulletPosition >= yBombPosition) &&
                  (yBulletPosition <= yBombPosition+BOMB_IMAGE_HEIGHT))) {
                    yBombPosition = 0;
                    bulletReleased = false;
                    repaint();
                    try {
                        Thread.sleep(350);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    private void bombMoving() {
        new Thread(() -> {
            bombReleased = true;
            for(int i=0; i<15; i++){
                while(yBombPosition<GAME_WINDOW_HEIGHT){
                    try {
                        Thread.sleep(50);
                        repaint();
                        yBombPosition += 10;
                        //System.out.println(yBombPosition);
                    }catch (InterruptedException ex) {}
                }
                yBombPosition = Y_BOMB_START_POSITION;
            }
        }).start();
    }

    private void doShooting() {
        new Thread(() -> {
            bulletReleased = true;
            xBulletPosition = xPlanePosition + PLANE_IMAGE_WIDTH /2;
            yBulletPosition = Y_BULLET_START_POSITION;
            while (yBulletPosition >= -10) {
                try {
                    Thread.sleep(15);
                    yBulletPosition -= 10;
                    repaint();
                } catch (InterruptedException ex) {
                    System.out.println("Exception at initShootingThread " + ex);
                }
            }
            bulletReleased = false;
            isAlreadyShooting = false;
        }).start();
    }

    private void initShooting() {
        getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke("SPACE"), "space");
        getActionMap().put("space", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!isAlreadyShooting){
                    doShooting();
                    isAlreadyShooting = true;
                }
            }
        });
    }

    private void initMovingLeft() {
        getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(0x25, 0), "leftArrow");
        getActionMap().put("leftArrow", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(xPlanePosition <= (0 - PLANE_IMAGE_WIDTH /2))
                    xPlanePosition = GAME_WINDOW_WIDTH - PLANE_IMAGE_WIDTH /2;
                else
                    xPlanePosition -= 10;
                repaint();
            }
        });
    }

    private void initMovingRight() {
        getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(0x27, 0), "rightArrow");
        getActionMap().put("rightArrow", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(xPlanePosition >= GAME_WINDOW_WIDTH - PLANE_IMAGE_WIDTH /2)
                    xPlanePosition = -PLANE_IMAGE_WIDTH /2;
                else
                    xPlanePosition += 10;
                repaint();
            }
        });
    }

    private void pauseTheGame() {
        getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(0x1B, 0), "escape");
        getActionMap().put("escape", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ESCAPE");
            }
        });
    }
}

/*
    Samolot to osobna klasa,
    pocisk osobna klasa,
    bomba to osobna klasa
*/


