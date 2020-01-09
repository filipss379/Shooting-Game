package shootingGame;

import shootingGame.Gameplay.GameProperties;
import shootingGame.Gameplay.GameStatusController;
import shootingGame.Gameplay.LevelCounter;
import shootingGame.Gameplay.ScoreCounter;
import shootingGame.Injectors.ResourcesInjector;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private final Color GAME_BACKGROUND_COLOR = new Color(0, 0,0);
    private final Color GAME_STATUS_INFO_COLOR = new Color(255, 255, 255);
    private final Font GAME_STATUS_INFO_FONT = new Font("Italic", Font.BOLD, 25);
    private final int GAME_INFO_DESCRIPTION_X_POSITION;
    private final int GAME_INFO_X_POSITION;
    private final int GAME_SCORE_Y_POSITION;
    private final int GAME_LEVEL_Y_POSITION;
    private final int LIVES_LEFT_Y_POSITION;

    public GamePanel (final int WIDTH,
                      final int HEIGHT) {
            GAME_INFO_DESCRIPTION_X_POSITION = WIDTH - 250;
            GAME_INFO_X_POSITION = WIDTH - 75;
            LIVES_LEFT_Y_POSITION = 110;
            GAME_SCORE_Y_POSITION = 70;
            GAME_LEVEL_Y_POSITION = 30;
            setSize(WIDTH, HEIGHT);
            setLocation(0,0);
            setLayout(new CardLayout());
            setBackground(GAME_BACKGROUND_COLOR);
            setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics gs) {
        final Graphics2D g = (Graphics2D)gs;
        super.paintComponent(g);
        g.setColor(GAME_STATUS_INFO_COLOR);
        g.setFont(GAME_STATUS_INFO_FONT);
        g.drawImage(ResourcesInjector.plane, GameProperties.xPlanePosition, GameProperties.Y_PLANE_POSITION, null);
        g.drawImage(ResourcesInjector.bomb, GameProperties.xBombPosition, GameProperties.yBombPosition, null);
        if(GameProperties.isShooting)
            g.drawImage(ResourcesInjector.bullet, GameProperties.xBulletPosition, GameProperties.yBulletPosition, null);
        g.drawString("Game Level", GAME_INFO_DESCRIPTION_X_POSITION, GAME_LEVEL_Y_POSITION);
        g.drawString("Game Score", GAME_INFO_DESCRIPTION_X_POSITION, GAME_SCORE_Y_POSITION);
        g.drawString("Lives Left", GAME_INFO_DESCRIPTION_X_POSITION, LIVES_LEFT_Y_POSITION);
        g.drawString(Integer.toString(ScoreCounter.getScore()), GAME_INFO_X_POSITION, GAME_SCORE_Y_POSITION);
        g.drawString(Integer.toString(LevelCounter.getGameLevel()), GAME_INFO_X_POSITION, GAME_LEVEL_Y_POSITION);
        g.drawString(Integer.toString(GameStatusController.getLivesLeft()), GAME_INFO_X_POSITION, LIVES_LEFT_Y_POSITION);
    }
}


