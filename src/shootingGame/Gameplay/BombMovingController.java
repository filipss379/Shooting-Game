package shootingGame.Gameplay;


public class BombMovingController extends GameProperties {

    public static void setBombStartPosition() {
        xBombPosition = (int)(Math.random() * (GAME_WINDOW_WIDTH-BOMB_IMAGE_WIDTH));
        yBombPosition = Y_BOMB_START_POSITION;
    }
}
