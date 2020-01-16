package shootingGame.Gameplay;

public class ScoreCounter {

    private static int score = 0;

    public static void addPointsToScore() {
        score += 10;
        if(score%150==0){
            LevelCounter.incrementGameLevel();
        }
    }

    public static int getScore() {
        return score;
    }

    public static void restartScore() {
        score = 0;
    }
}
