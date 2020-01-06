package shootingGame.Gameplay;

import shootingGame.Injectors.PanelsInjector;

public class Gameplay extends GameStatusFields {

    Thread gameThread = new Thread();
    private GameKeyController gameKeyController
            = new GameKeyController();
    private ShootingController shootingController
            = new ShootingController();
    private CollisionController collisionController
            = new CollisionController();

    public Gameplay() {
        gameKeyController.initGameKeyBinding();
        initGameplay();
        gameThread.start();
    }

    public void initGameplay() {
       gameThread = new Thread(() -> {
            bombReleased = true;
            while(true) {

                if(yBombPosition >= GAME_WINDOW_HEIGHT) {
                    yBombPosition = Y_BOMB_START_POSITION;
                    BombMovingController.setBombStartPosition();
                }
                if(bulletReleased) {
                    shootingController.setBulletStartPosition();
                    isAlreadyShooting = true;
                    bulletReleased = false;
                }
                if(yBulletPosition < 0)
                    isAlreadyShooting = false;
                if(collisionController.checkIfWasCollision()){
                    collisionController.restartGameStatus();
                }

                yBombPosition += 1;
                yBulletPosition -= 3;
                try {
                    gameThread.sleep(5);
                } catch (InterruptedException ex) {}
                PanelsInjector.getGamePanel().repaint();
            }
        });
    }



}
