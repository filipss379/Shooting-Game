package shootingGame.Statistics;

public class StatisticsController extends PlayersNamesAndScores{

    private static StatisticsFileReader statisticsFileReader = null;
    private static UpdateStatisticsController updateStatisticsController = null;
    private static UpdatedStatisticsDataWriter updatedStatisticsDataWriter = null;
    private static StatisticsPrinter statisticsPrinter = null;

    public static void saveNewStatistics() {
        statisticsFileReader = new StatisticsFileReader();
        updateStatisticsController = new UpdateStatisticsController();
        updatedStatisticsDataWriter = new UpdatedStatisticsDataWriter();
        statisticsFileReader.readStatisticsFile();
        updateStatisticsController.updateStatistics();
        updatedStatisticsDataWriter.cleanOldStatisticsData();
        updatedStatisticsDataWriter.saveUpdatedStatisticsData();
        clearPlayersAndScoresMap();
    }

    public static void showStatistics() {
        statisticsFileReader = new StatisticsFileReader();
        statisticsPrinter = new StatisticsPrinter();
        statisticsFileReader.readStatisticsFile();
        statisticsPrinter.printStatisticsOnLabel();
        clearPlayersAndScoresMap();
    }

    private static void clearPlayersAndScoresMap() {
        playersAndScoresMap.clear();
    }
}
