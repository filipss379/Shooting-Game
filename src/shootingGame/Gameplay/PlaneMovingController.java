package shootingGame.Gameplay;

public class PlaneMovingController extends GameProperties {

    public static void movingLeft() {
        if(xPlanePosition <= (0 - PLANE_IMAGE_WIDTH /2))
            xPlanePosition = GAME_WINDOW_WIDTH - PLANE_IMAGE_WIDTH /2;
        else
            xPlanePosition -= DifficultyController.getPlaneMovingStep();
    }

    public static void movingRight() {
        if(xPlanePosition >= (GAME_WINDOW_WIDTH - PLANE_IMAGE_WIDTH /2))
            xPlanePosition = -PLANE_IMAGE_WIDTH /2;
        else
            xPlanePosition += DifficultyController.getPlaneMovingStep();
    }
}
