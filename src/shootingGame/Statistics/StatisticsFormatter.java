package shootingGame.Statistics;

public class StatisticsFormatter extends PlayersNamesAndScores {

    private static StringBuffer playersAndScores = null;

    public StatisticsFormatter() {
        playersAndScores = new StringBuffer();
    }

    //trzeba rozbic na 2 metody zapis do pliku i wypisanie na labelu

    public String changePlayersAndScoresFormat() {
        playersAndScoresMap.forEach((player, score) ->
                playersAndScores.append(player + " " + score + "\n"));
        return playersAndScores.toString();
    }
}
