package shootingGame.Gameplay;

public class ShootingController extends GameProperties {

    public static void releaseTheBullet() {
        if(!isShooting)
            bulletReleased = true;
        setBulletStartPosition();
    }

    public static void setBulletStartPosition() {
        xBulletPosition = xPlanePosition + PLANE_IMAGE_WIDTH /2;
        yBulletPosition = Y_BULLET_START_POSITION;
        updateShootingStatus();
    }

    private static void updateShootingStatus() {
        isShooting = true;
        bulletReleased = false;
    }
}
