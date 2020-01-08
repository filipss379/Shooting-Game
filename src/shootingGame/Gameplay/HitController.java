package shootingGame.Gameplay;


public class HitController extends GameProperties {

//rozbij na metody zeby x i y osobno
    public void checkIfWasHit() {
        if(((xBulletPosition <= xBombPosition+BOMB_IMAGE_WIDTH) &&
            (xBulletPosition >= xBombPosition)) &&
            (yBulletPosition <= yBombPosition+BOMB_IMAGE_HEIGHT))
            GameStatusController.restartGameStatusAfterHit();
    }
}
