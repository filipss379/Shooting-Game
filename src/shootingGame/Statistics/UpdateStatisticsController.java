package shootingGame.Statistics;

import shootingGame.Gameplay.ScoreCounter;

public class UpdateStatisticsController extends PlayersNamesAndScores {

    private static String playerName;
    private static int playerScore;

    public UpdateStatisticsController() {
        playerName = PlayerNameController.getPlayerName();
        playerScore = ScoreCounter.getScore();
    }

    public void updateStatistics() {
        if(checkIfPlayerExists())
            replaceScoreIfCurrentBetter();
        else
            addNewPlayerToStatistics();
    }

    private void addNewPlayerToStatistics() {
        playersAndScoresMap.put(playerName, Integer.toString(playerScore));
        System.out.println(playersAndScoresMap.toString());
    }

    public void replaceScoreIfCurrentBetter() {
        if(checkIfScoreIsBetter()) {
            playersAndScoresMap.replace(playerName, Integer.toString(playerScore));
        }
    }

    private boolean checkIfPlayerExists() {
        return playersAndScoresMap.containsKey(playerName);
    }

    public boolean checkIfScoreIsBetter() {
        return Integer.parseInt(playersAndScoresMap.get(playerName))
               < ScoreCounter.getScore();
    }
}
