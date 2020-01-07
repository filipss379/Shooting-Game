package shootingGame.Gameplay;

public class GameStatusController extends GameProperties {

    public static void restartGameStatusAfterHit() {
        ScoreCounter.addPointsToScore();
        isAlreadyShooting = false;
        BombMovingController.setBombStartPosition();
    }

    public static void restartGameStatusAfterCollision() {
        ScoreCounter.subtractPointsFromScore();
        isAlreadyShooting = false;
        BombMovingController.setBombStartPosition();
    }
}
