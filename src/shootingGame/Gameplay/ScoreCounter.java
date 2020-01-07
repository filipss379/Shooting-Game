package shootingGame.Gameplay;

public class ScoreCounter {

    private static int score = 0;

    public static void addPointsToScore() {
        score += 10;
        if(score%150==0){
            LevelCounter.incrementGameLevel();
        }
    }

    public static void subtractPointsFromScore() {
        if(score!=0) {
            score -= 10;
        }
    }

    public static int getScore() {
        return score;
    }
}
