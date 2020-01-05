package shootingGame.Gameplay;

public class GameInitilizer {

    private static GameKeyController gameKeyController;
    private static BombMovingController bombMovingController;
    private static CollisionController collisionController;

    public static void startGame() {
        gameKeyController = new GameKeyController();
        bombMovingController = new BombMovingController();
        collisionController = new CollisionController();
        executeGameStartingMethods();
    }

    private static void executeGameStartingMethods() {
        try {
            gameKeyController.initGameKeyBinding();
            bombMovingController.bombMovingThread();
            collisionController.checkIfWasCollisionThread();
        } catch (NullPointerException ex) {}
    }
}
