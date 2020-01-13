package shootingGame.Gameplay;


public class HitController extends GameProperties {
    
    public void checkIfWasHit() {
        if(checkXCoordinates() && checkYCoordinates())
            GameStatusController.restartGameStatusAfterHit();
    }

    private boolean checkXCoordinates() {
        return ((xBulletPosition <= xBombPosition+BOMB_IMAGE_WIDTH) &&
                (xBulletPosition >= xBombPosition));
    }

    private boolean checkYCoordinates() {
        return (yBulletPosition <= yBombPosition+BOMB_IMAGE_HEIGHT);
    }
}
