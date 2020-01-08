package shootingGame.Gameplay;

public class CollisionController extends GameProperties {

    public void checkIfWasCollision() {
        if(checkXCoordinates() && checkYCoordinates())
            GameStatusController.restartGameStatusAfterCollision();
    }

    private boolean checkXCoordinates() {
        return ((xBombPosition+BOMB_IMAGE_HEIGHT>=xPlanePosition) &&
                (xBombPosition<=xPlanePosition+PLANE_IMAGE_WIDTH));
    }

    private boolean checkYCoordinates() {
        return (yBombPosition+BOMB_IMAGE_HEIGHT >= Y_PLANE_POSITION);
    }
}
