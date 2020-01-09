package shootingGame.Gameplay;

import shootingGame.Injectors.GameComponentsInjector;

public class Gameplay extends GameProperties {

    private static Thread gameThread = new Thread();
    private GameKeyController gameKeyController
            = new GameKeyController();
    private HitController hitController
            = new HitController();
    private CollisionController collisionController
            = new CollisionController();

    public Gameplay() {
        gameKeyController.initGameKeyBinding();
        initGameplay();
        gameThread.start();
    }

    public void initGameplay() {
       gameThread = new Thread(() -> {
            while(true) {
                if(!shouldWait) {
                    hitController.checkIfWasHit();
                    collisionController.checkIfWasCollision();

                    if(yBombPosition >= GAME_WINDOW_HEIGHT)
                        BombMovingController.setBombStartPosition();

                    if(yBulletPosition < 0)
                        isShooting = false;

                    setGameDynamics();
                    GameComponentsInjector.getGamePanel().repaint();
                }
            }
        });
    }

    private void setGameDynamics() {
        yBombPosition += DifficultyController.getBombMovingStep();
        yBulletPosition -= DifficultyController.getBulletMovingStep();

        try {
            gameThread.sleep(DifficultyController.getRefreshFrequency());
        } catch (InterruptedException ex) {
            System.out.println("Exception while sleep the  game thread" + ex);
        }
    }
}
