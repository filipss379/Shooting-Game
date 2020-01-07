package shootingGame.Gameplay;


public class HitController extends GameProperties {


    public void checkIfWasHit() {
        if(((xBulletPosition <= xBombPosition+BOMB_IMAGE_WIDTH) &&
            (xBulletPosition >= xBombPosition)) &&
            (yBulletPosition <= yBombPosition+BOMB_IMAGE_HEIGHT))
            GameStatusController.restartGameStatusAfterHit();
    }

}
