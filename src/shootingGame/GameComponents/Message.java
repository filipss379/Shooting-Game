package shootingGame.GameComponents;

import shootingGame.Gameplay.ScoreCounter;
import shootingGame.Injectors.ButtonsInjector;
import shootingGame.Injectors.GameComponentsInjector;

import javax.swing.*;
import java.awt.*;

public class Message extends JDialog {

    private static final Color BACKGROUND_COLOR = new Color(130, 130, 130);
    private static final Color FOREGROUND_COLOR = new Color(35, 35, 35);
    private static final JLabel INFO_TEXT = new JLabel();
    private static final JTextField PLAYER_NAME = new JTextField();
    private static final Font INFO_FONT = new Font("Italic", Font.BOLD, 20);

    public Message(final int WIDTH,
                   final int HEIGHT) {
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(GameComponentsInjector.getGamePanel());
        setBackground(BACKGROUND_COLOR);
        setUndecorated(true);
        setLayout(null);
        add(INFO_TEXT);
        setInfoTextProperties();
        setPlayerNameProperties();
        setVisible(false);
    }

    public void setMessageComponents(final String action) {
        switch (action) {
            case "Start" : {
                setActionInfoText();
                add(PLAYER_NAME);
                add(ButtonsInjector.getOKButton());
                break;
            }
            case "Pause" : {
                setCloseTheGameInfoText();
                add(ButtonsInjector.getReturnToGameButton());
                add(ButtonsInjector.getReturnToMenuButton());
                break;
            }
            case "End" : {
                setEndTheGameInfoText();
                add(ButtonsInjector.getReturnToMenuButton());
                break;
            }
        }
    }

    public void setActionInfoText() {
        String firstLine = "Welcome in Shooting Game! ";
        String secondLine = "Put your name to the filed and press OK button";
        INFO_TEXT.setText("<html><p>" + firstLine + "<br>"
                         + secondLine + "</p></html>");
    }

    public void setCloseTheGameInfoText() {
        String text = "Do you want leave the game?";
        INFO_TEXT.setText(text);
    }

    public void setEndTheGameInfoText() {
        String firstLine = "End the game!";
        String secondLine = "Your score is " + ScoreCounter.getScore();
        INFO_TEXT.setText("<html><p>" + firstLine + "<br>"
                + secondLine + "</p></html>");
    }

    private void setPlayerNameProperties() {
        PLAYER_NAME.setColumns(15);
        PLAYER_NAME.setSize(250, 35);
        PLAYER_NAME.setLocation(125, 150);
        PLAYER_NAME.setBackground(new Color(255, 255, 255));
        PLAYER_NAME.setVisible(true);
    }

    private void setInfoTextProperties() {
        INFO_TEXT.setSize(380, 100);
        INFO_TEXT.setLocation(60, 15);
        INFO_TEXT.setFont(INFO_FONT);
        INFO_TEXT.setBackground(BACKGROUND_COLOR);
        INFO_TEXT.setForeground(FOREGROUND_COLOR);
        INFO_TEXT.setBorder(null);
        INFO_TEXT.setVisible(true);
    }

    public JTextField getPLAYER_NAME() {
        return PLAYER_NAME;
    }

    public void clearPlayerNameField() {
        PLAYER_NAME.setText("");
    }
}
