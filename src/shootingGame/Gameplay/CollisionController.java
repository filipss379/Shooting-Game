package shootingGame.Gameplay;

import shootingGame.Injectors.PanelsInjector;

public class CollisionController extends GameStatusFields {

    public void checkIfWasCollisionThread(){
        new Thread(() -> {
            while(true){
                setCollisionVerificationFreq();
                if(checkIfWasCollision())
                    restartGameStatus();
            }
        }).start();
    }

    private void setCollisionVerificationFreq() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }

    private boolean checkIfWasCollision() {
        if(((xBulletPosition <= (xBombPosition+BOMB_IMAGE_WIDTH)) &&
            (xBulletPosition >= xBombPosition)) &&
           ((yBulletPosition >= yBombPosition) &&
            (yBulletPosition <= yBombPosition+BOMB_IMAGE_HEIGHT)))
            return true;
        else
            return false;
    }

    private void restartGameStatus() {
        yBombPosition = Y_BOMB_START_POSITION;
        bulletReleased = false;
        PanelsInjector.getGamePanel().repaint();
    }
}
