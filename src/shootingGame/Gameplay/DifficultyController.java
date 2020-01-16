package shootingGame.Gameplay;

public class DifficultyController {

    private static int refreshFrequency = 5;
    private static int bombMovingStep = 1;
    private static float bulletMovingStep = 3;
    private static int planeMovingStep = 20;

    public static void increaseGameDifficulty() {
        bombMovingStep += 1;
        bulletMovingStep += 1.5;
        refreshFrequency += 2;
        planeMovingStep += 4;
    }

    public static int getRefreshFrequency() {
        return refreshFrequency;
    }

    public static int getBombMovingStep() {
        return bombMovingStep;
    }

    public static float getBulletMovingStep() {
        return bulletMovingStep;
    }

    public static int getPlaneMovingStep() {
        return planeMovingStep;
    }

    public static void restartGameDifficulty() {
        refreshFrequency = 5;
        bombMovingStep = 1;
        bulletMovingStep = 3;
        planeMovingStep = 20;
    }
}
