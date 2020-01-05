package shootingGame.Gameplay;

public abstract class GameStatus {
    public static final int PLANE_IMAGE_WIDTH = 80;
    public static final int BULLET_IMAGE_HEIGHT = 35;
    public static final int BOMB_IMAGE_WIDTH = 44;
    public static final int BOMB_IMAGE_HEIGHT = 45;
    public static final int Y_PLANE_POSITION = 600;
    public static final int Y_BOMB_START_POSITION = 0;
    public static int Y_BULLET_START_POSITION;
    public static int xPlanePosition;
    public static int yBulletPosition;
    public static int xBulletPosition;
    public int xBombPosition = 200;
    public int yBombPosition = 0;
    public boolean bulletReleased = false;
    public boolean bombReleased = false;
    public boolean isAlreadyShooting = false;
}
