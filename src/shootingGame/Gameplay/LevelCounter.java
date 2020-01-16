package shootingGame.Gameplay;

public class LevelCounter {

    private static int gameLevel = 1;

    public static void incrementGameLevel() {
        gameLevel++;
        DifficultyController.increaseGameDifficulty();
    }

    public static int getGameLevel() {
        return gameLevel;
    }

    public static void restartLevel() {
        gameLevel = 3;
    }
}
