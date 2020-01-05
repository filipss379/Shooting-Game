package shootingGame.Gameplay;

public abstract class GameStatusFields {
    static final int Y_PLANE_POSITION = 600;
    protected static final int GAME_WINDOW_WIDTH = 800;
    protected static final int GAME_WINDOW_HEIGHT = 768;
    protected static final int PLANE_IMAGE_WIDTH = 80;
    protected static final int BULLET_IMAGE_HEIGHT = 35;
    protected static final int BOMB_IMAGE_WIDTH = 44;
    protected static final int BOMB_IMAGE_HEIGHT = 45;
    protected static final int Y_BOMB_START_POSITION = 0;
    protected static final int Y_BULLET_START_POSITION = Y_PLANE_POSITION - BULLET_IMAGE_HEIGHT;
    volatile static int xPlanePosition = (GAME_WINDOW_WIDTH - PLANE_IMAGE_WIDTH) /2;
    volatile static int yBulletPosition;
    volatile static int xBulletPosition;
    volatile static int xBombPosition = 200;
    volatile static int yBombPosition = Y_BOMB_START_POSITION;
    volatile static boolean bulletReleased = false;
    volatile static boolean bombReleased = false;
    volatile boolean isAlreadyShooting = false;
    volatile boolean wasCollision = false;
}
