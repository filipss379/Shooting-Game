package shootingGame.Gameplay;

public class ShootingController extends GameStatusFields {

    public void setBulletStartPosition() {
        xBulletPosition = xPlanePosition + PLANE_IMAGE_WIDTH /2;
        yBulletPosition = Y_BULLET_START_POSITION;
    }
}
