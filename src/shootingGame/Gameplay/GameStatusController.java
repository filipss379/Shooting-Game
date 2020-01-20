package shootingGame.Gameplay;

import shootingGame.Injectors.GameComponentsInjector;

public class GameStatusController extends GameProperties {

    private static int livesLeft = 3;

    public static void startTheGame() {
        shouldWait = false;
        BombMovingController.setBombStartPosition();

    }

    public static void resumeTheGame() {
        shouldWait = false;
    }

    public static void stopTheGame() {
        shouldWait = true;
        isShooting = false;
        bulletReleased = false;
    }

    public static void restartGameStatusAfterHit() {
        ScoreCounter.addPointsToScore();
        isShooting = false;
        BombMovingController.setBombStartPosition();
    }

    public static void restartGameStatusAfterCollision() {
        checkLivesLeft();
        isShooting = false;
        BombMovingController.setBombStartPosition();
    }

    private static void checkLivesLeft() {
        if(livesLeft==0){
            GameStatusController.stopTheGame();
            GameComponentsInjector.setEndTheGameMessage();
        } else
            livesLeft--;
    }

    public static int getLivesLeft() {
        return livesLeft;
    }

    public static void restartLivesLeft() {
        livesLeft = 3;
    }
}
