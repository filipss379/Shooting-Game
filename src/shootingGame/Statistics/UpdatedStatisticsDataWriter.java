package shootingGame.Statistics;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class UpdatedStatisticsDataWriter extends PlayersNamesAndScores {

    private static FileOutputStream statisticsFileCleaner = null;
    private static FileWriter updatedDataWriter = null;
    private static StatisticsFormatter statisticsFormatter = null;

    public UpdatedStatisticsDataWriter() {
        statisticsFormatter = new StatisticsFormatter();
    }

    public void cleanOldStatisticsData() {
        try {
            statisticsFileCleaner = new FileOutputStream(statisticsFilePath);
        } catch (IOException ex) {
            System.out.println("Exception while file output stream initialization " + ex);
        } finally {
            try {
                statisticsFileCleaner.close();
            } catch (IOException ex) {
                System.out.println("Exception while closing file " + ex);
            }
        }
    }

    private void initFileWriter() {
        try {
            updatedDataWriter = new FileWriter(statisticsFilePath);
        } catch (IOException ex) {
            System.out.println("Exception while new data writer initialization" + ex);
        }
    }

    public void saveUpdatedStatisticsData() {
        initFileWriter();
        try {
            updatedDataWriter.write(statisticsFormatter.changePlayersAndScoresFormat());
        } catch (IOException ex) {
            System.out.println("Exception while saving data to file" + ex);
        } finally {
            try {
                updatedDataWriter.close();
            } catch (IOException ex) {
                System.out.println("Exception while closing print writer" + ex);
            }
        }
    }
}
