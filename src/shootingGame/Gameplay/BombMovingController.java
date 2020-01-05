package shootingGame.Gameplay;

import shootingGame.Injectors.PanelsInjector;

public class BombMovingController extends GameStatusFields {

    public void bombMovingThread() {
        new Thread(() -> {
            bombReleased = true;
            while(true){
                //yBombPosition = Y_BOMB_START_POSITION;
                bombMovingLoop();
            }
        }).start();
    }

    private void bombMovingLoop() {
        while(yBombPosition<GAME_WINDOW_HEIGHT) {
            if(wasCollision){
                try {
                    bombReleased = false;
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            }
            bombReleased = true;
            PanelsInjector.getGamePanel().repaint();
            yBombPosition += 10;
            setBombMovingSpeed();
        }
    }

    private void setBombMovingSpeed() {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException ex) {
            System.out.println();
        }
    }
}
