package shootingGame.Gameplay;

public class LevelCounter {

    private static int gameLevel = 1;

    public static void incrementGameLevel() {
        if(gameLevel == 5)
            System.out.println("End of the game");
        gameLevel++;
        increaseGameDynamics();
    }

    private static void increaseGameDynamics() {
        DifficultyController.increaseBulletMovingStep();
        DifficultyController.increaseBombMovingStep();
        DifficultyController.reduceRefreshFrequency();
        DifficultyController.increasePlaneMovingStep();
    }

}
