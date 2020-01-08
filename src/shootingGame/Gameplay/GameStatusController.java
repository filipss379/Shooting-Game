package shootingGame.Gameplay;

public class GameStatusController extends GameProperties {

    private static int livesLeft = 3;

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
        if(livesLeft==0)
            System.out.println("END GAME");
        else
            livesLeft--;
    }

    public static int getLivesLeft() {
        return livesLeft;
    }
}
