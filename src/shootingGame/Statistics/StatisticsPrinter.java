package shootingGame.Statistics;

import shootingGame.Injectors.GameComponentsInjector;

public class StatisticsPrinter extends PlayersNamesAndScores {

    private static StatisticsFormatter statisticsFormatter = null;

    public StatisticsPrinter() {
        statisticsFormatter = new StatisticsFormatter();
    }

    public void printStatisticsOnLabel() {
        GameComponentsInjector.getStatisticsLabel().setText(
                statisticsFormatter.changePlayersAndScoresFormat());
    }
}
