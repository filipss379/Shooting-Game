package shootingGame.Gameplay;

public class CollisionController extends GameProperties {

    public void checkIfWasCollision() {
        if(checkXCoordinates() && checkYCoordinates())
            GameStatusController.restartGameStatusAfterCollision();
    }

    private boolean checkXCoordinates() {
        if((xBombPosition+BOMB_IMAGE_HEIGHT>=xPlanePosition) &&
           (xBombPosition<=xPlanePosition+PLANE_IMAGE_WIDTH))
            return true;
        else
            return false;
    }

    private boolean checkYCoordinates() {
        if(yBombPosition+BOMB_IMAGE_HEIGHT >= Y_PLANE_POSITION)
            return true;
        else
            return false;
    }

}
