package shootingGame.Statistics;

public class PlayerNameController {

    private static String playerName = "";

    public static void setPlayerName(final String name) {
        playerName = name;
    }

    public static String getPlayerName() {
        return playerName;
    }
}
