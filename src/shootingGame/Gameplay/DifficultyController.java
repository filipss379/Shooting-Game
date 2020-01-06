package shootingGame.Gameplay;

public class DifficultyController {

    private static int refreshFrequency = 5;
    private static int bombMovingStep = 1;
    private static int bulletMovingStep = 3;
    private static int planeMovingStep = 20;

    public static void increaseBombMovingStep() {
        bombMovingStep += 1;
    }

    public static void increaseBulletMovingStep() {
        bulletMovingStep += 1;
    }

    public static void reduceRefreshFrequency() {
        refreshFrequency += 2;
    }

    public static void increasePlaneMovingStep() {
        planeMovingStep += 3;
    }

    public static int getRefreshFrequency() {
        return refreshFrequency;
    }

    public static int getBombMovingStep() {
        return bombMovingStep;
    }

    public static int getBulletMovingStep() {
        return bulletMovingStep;
    }

    public static int getPlaneMovingStep() {
        return planeMovingStep;
    }


}
