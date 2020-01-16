package shootingGame.Gameplay;

import shootingGame.Injectors.GameComponentsInjector;

public class EndGameController extends GameProperties {

    public static void leaveTheGame() {
        GameComponentsInjector.removeMessage();
        GameComponentsInjector.setMenuPanel();
        restartGameStatus();
    }

    private static void restartGameStatus() {
        GameStatusController.stopTheGame();
        GameStatusController.restartLivesLeft();
        LevelCounter.restartLevel();
        ScoreCounter.restartScore();
        DifficultyController.restartGameDifficulty();
        BombMovingController.setBombStartPosition();
    }
}
