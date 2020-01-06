package shootingGame.Gameplay;


public class CollisionController extends GameStatusFields {


    public boolean checkIfWasCollision() {
        if(((xBulletPosition <= (xBombPosition+BOMB_IMAGE_WIDTH)) &&
            (xBulletPosition >= xBombPosition)) &&
           ((yBulletPosition >= yBombPosition) &&
            (yBulletPosition <= yBombPosition+BOMB_IMAGE_HEIGHT)))
            return true;
        else
            return false;
    }

    public void restartGameStatus() {
        isAlreadyShooting = false;
        BombMovingController.setBombStartPosition();
    }


}
