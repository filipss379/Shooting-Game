package shootingGame.Gameplay;


public class BombMovingController extends GameStatusFields {

    public static void setBombStartPosition() {
        xBombPosition = (int)(Math.random() * (GAME_WINDOW_WIDTH+1));
        yBombPosition = Y_BOMB_START_POSITION;
    }
}
