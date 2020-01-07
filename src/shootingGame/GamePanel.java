package shootingGame;

import shootingGame.Gameplay.GameProperties;
import shootingGame.Gameplay.LevelCounter;
import shootingGame.Gameplay.ScoreCounter;
import shootingGame.Injectors.ResourcesInjector;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private final Color GAME_BACKGROUND_COLOR = new Color(0, 0,0);
    private final Color GAME_STATUS_INFO_COLOR = new Color(255, 255, 255);
    private final Font GAME_STATUS_INFO_FONT = new Font("Italic", Font.BOLD, 25);
    private final int GAME_INFO_X_POSITION;
    private final int GAME_SCORE_LEVEL_X_POSITION;
    private final int GAME_SCORE_Y_POSITION;
    private final int GAME_LEVEL_Y_POSITION;

    public GamePanel (final int WIDTH,
                      final int HEIGHT) {
            GAME_INFO_X_POSITION = WIDTH - 225;
            GAME_SCORE_LEVEL_X_POSITION = WIDTH - 50;
            GAME_SCORE_Y_POSITION = 100;
            GAME_LEVEL_Y_POSITION = 50;
            setSize(WIDTH, HEIGHT);
            setLocation(0,0);
            setVisible(true);
            setBackground(GAME_BACKGROUND_COLOR);
    }

    @Override
    protected void paintComponent(Graphics gs) {
        final Graphics2D g = (Graphics2D)gs;
        super.paintComponent(g);
        g.setColor(GAME_STATUS_INFO_COLOR);
        g.setFont(GAME_STATUS_INFO_FONT);
        g.drawImage(ResourcesInjector.plane, GameProperties.xPlanePosition, GameProperties.Y_PLANE_POSITION, null);
        if(GameProperties.bombReleased)
            g.drawImage(ResourcesInjector.bomb, GameProperties.xBombPosition, GameProperties.yBombPosition, null);
        if(GameProperties.isAlreadyShooting)
            g.drawImage(ResourcesInjector.bullet, GameProperties.xBulletPosition, GameProperties.yBulletPosition, null);
        g.drawString("Game Level", GAME_INFO_X_POSITION, GAME_LEVEL_Y_POSITION);
        g.drawString("Game Score", GAME_INFO_X_POSITION, GAME_SCORE_Y_POSITION);
        g.drawString(Integer.toString(ScoreCounter.getScore()), GAME_SCORE_LEVEL_X_POSITION, GAME_SCORE_Y_POSITION);
        g.drawString(Integer.toString(LevelCounter.getGameLevel()), GAME_SCORE_LEVEL_X_POSITION, GAME_LEVEL_Y_POSITION);
    }
}


