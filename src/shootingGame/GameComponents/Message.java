package shootingGame.GameComponents;

import shootingGame.Gameplay.ScoreCounter;
import shootingGame.Injectors.ButtonsInjector;
import shootingGame.Injectors.GameComponentsInjector;

import javax.swing.*;
import java.awt.*;


public class Message extends JDialog {

    private final Color BACKGROUND_COLOR = new Color(130, 130, 130);
    private final JLabel infoText = new JLabel();
    private final JTextField playerName = new JTextField();

    public Message(final int WIDTH,
                   final int HEIGHT) {
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(GameComponentsInjector.getGamePanel());
        setBackground(BACKGROUND_COLOR);
        setUndecorated(true);
        setLayout(null);
        add(infoText);
        setInfoTextProperties();
        setPlayerNameProperties();
        setVisible(false);
    }

    public void setMessageComponents(final String action) {
        switch (action) {
            case "Start" : {
                setActionInfoText();
                add(playerName);
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
        infoText.setText("<html><p>" + firstLine + "<br>"
                         + secondLine + "</p></html>");
    }

    public void setCloseTheGameInfoText() {
        String text = "Do you want leave the game?";
        infoText.setText(text);
    }

    public void setEndTheGameInfoText() {
        String firstLine = "End the game!";
        String secondLine = "Your score is " + ScoreCounter.getScore();
        infoText.setText("<html><p>" + firstLine + "<br>"
                + secondLine + "</p></html>");
    }

    private void setPlayerNameProperties() {
        playerName.setColumns(15);
        playerName.setSize(250, 35);
        playerName.setLocation(125, 150);
        playerName.setBackground(new Color(255, 255, 255));
        playerName.setVisible(true);
    }

    private void setInfoTextProperties() {
        infoText.setSize(380, 100);
        infoText.setLocation(60, 15);
        infoText.setFont(new Font("Italic", Font.BOLD, 20));
        infoText.setBackground(BACKGROUND_COLOR);
        infoText.setForeground(new Color(35, 35, 35));
        infoText.setBorder(null);
        infoText.setVisible(true);
    }

    public JTextField getPlayerName() {
        return playerName;
    }

    public void clearPlayerNameField() {
        playerName.setText("");
    }
}
