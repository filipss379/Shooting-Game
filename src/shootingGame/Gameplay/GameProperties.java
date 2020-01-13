package shootingGame.Gameplay;

public abstract class GameProperties {
    public static final int Y_PLANE_POSITION = 600;
    protected static final int GAME_WINDOW_WIDTH = 1024;
    protected static final int GAME_WINDOW_HEIGHT = 768;
    protected static final int PLANE_IMAGE_WIDTH = 80;
    protected static final int BULLET_IMAGE_HEIGHT = 35;
    protected static final int BOMB_IMAGE_WIDTH = 44;
    protected static final int BOMB_IMAGE_HEIGHT = 45;
    protected static final int Y_BOMB_START_POSITION = 0;
    protected static final int Y_BULLET_START_POSITION = Y_PLANE_POSITION - BULLET_IMAGE_HEIGHT;
    public volatile static int xPlanePosition = (GAME_WINDOW_WIDTH - PLANE_IMAGE_WIDTH) /2;
    public volatile static int yBulletPosition;
    public volatile static int xBulletPosition;
    public volatile static int xBombPosition = 200;
    public volatile static int yBombPosition = Y_BOMB_START_POSITION;
    public volatile static boolean isShooting = false;
    public volatile static boolean shouldWait = false;
    protected volatile static boolean bulletReleased = false;
}
