package shootingGame.Gameplay;

import shootingGame.Injectors.PanelsInjector;

public class ShootingController extends GameStatusFields {

    public void doShooting() {
        new Thread(() -> {
            bulletReleased = true;
            setBulletStartPosition();
            bulletMovingLoop();
        }).start();
        bulletReleased = false;
       // isAlreadyShooting = false;
    }

    private void setBulletStartPosition() {
        xBulletPosition = xPlanePosition + PLANE_IMAGE_WIDTH /2;
        yBulletPosition = Y_BULLET_START_POSITION;
    }

    private void bulletMovingLoop() {
        while (yBulletPosition >= -10) {
            setBulletMovingSpeed();
            yBulletPosition -= 10;
            PanelsInjector.getGamePanel().repaint();
        }
    }

    private void setBulletMovingSpeed() {
        try {
            Thread.sleep(20);
        } catch (InterruptedException ex) {
            System.out.println("Exception at initShootingThread " + ex);
        }
    }



}
