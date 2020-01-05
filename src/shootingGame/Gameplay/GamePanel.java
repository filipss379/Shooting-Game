package shootingGame.Gameplay;

import shootingGame.Injectors.ResourcesInjector;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private static final Color GAME_BACKGROUND_COLOR = new Color(0, 0, 0);

    public GamePanel (final int WIDTH,
                      final int HEIGHT) {

            setSize(WIDTH, HEIGHT);
            setLocation(0,0);
            setVisible(true);
            setBackground(GAME_BACKGROUND_COLOR);
    }

    @Override
    protected void paintComponent(Graphics gs) {
        final Graphics2D g = (Graphics2D)gs;
        super.paintComponent(g);

        g.drawImage(ResourcesInjector.plane, GameStatusFields.xPlanePosition, GameStatusFields.Y_PLANE_POSITION, null);
        if(GameStatusFields.bombReleased)
            g.drawImage(ResourcesInjector.bomb, GameStatusFields.xBombPosition, GameStatusFields.yBombPosition, null);
        if(GameStatusFields.bulletReleased)
            g.drawImage(ResourcesInjector.bullet, GameStatusFields.xBulletPosition, GameStatusFields.yBulletPosition, null);
    }


}


