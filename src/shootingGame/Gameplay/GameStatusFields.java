package shootingGame.Gameplay;

public abstract class GameStatusFields {
    public static final int Y_PLANE_POSITION = 600;
    protected static final int GAME_WINDOW_WIDTH = 800;
    protected static final int GAME_WINDOW_HEIGHT = 768;
    protected static final int PLANE_IMAGE_WIDTH = 80;
    protected static final int BULLET_IMAGE_HEIGHT = 35;
    protected static final int BOMB_IMAGE_WIDTH = 44;
    protected static final int BOMB_IMAGE_HEIGHT = 45;
    protected static final int Y_BOMB_START_POSITION = 0;
    protected static final int Y_BULLET_START_POSITION = Y_PLANE_POSITION - BULLET_IMAGE_HEIGHT;
    public static int xPlanePosition = (GAME_WINDOW_WIDTH - PLANE_IMAGE_WIDTH) /2;
    public static int yBulletPosition;
    public static int xBulletPosition;
    public static int xBombPosition = 200;
    public static int yBombPosition = Y_BOMB_START_POSITION;
    public static boolean bombReleased = false;
    public static boolean isAlreadyShooting = false;
    protected static boolean bulletReleased = false;
}
