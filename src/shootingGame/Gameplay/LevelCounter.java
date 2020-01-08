package shootingGame.Gameplay;

public class LevelCounter {

    private static int gameLevel = 1;

    public static void incrementGameLevel() {
        gameLevel++;
        increaseGameDynamics();
    }

    private static void increaseGameDynamics() {
        DifficultyController.increaseBulletMovingStep();
        DifficultyController.increaseBombMovingStep();
        DifficultyController.increasePlaneMovingStep();
        DifficultyController.reduceRefreshFrequency();
    }

    public static int getGameLevel() {
        return gameLevel;
    }

}
