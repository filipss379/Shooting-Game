package shootingGame.Gameplay;

import shootingGame.Injectors.PanelsInjector;

public class Gameplay extends GameStatusFields {

    private Thread gameThread = new Thread();
    private GameKeyController gameKeyController
            = new GameKeyController();
    private ShootingController shootingController
            = new ShootingController();
    private HitController hitController
            = new HitController();

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
                if(hitController.checkIfWasHit()){
                    ScoreCounter.addPointsToScore();
                    hitController.restartGameStatus();
                }

                yBombPosition += DifficultyController.getBombMovingStep();
                yBulletPosition -= DifficultyController.getBulletMovingStep();
                try {
                    gameThread.sleep(DifficultyController.getRefreshFrequency());
                } catch (InterruptedException ex) {

                }
                PanelsInjector.getGamePanel().repaint();
            }
        });
    }
}
