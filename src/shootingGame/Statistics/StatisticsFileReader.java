package shootingGame.Statistics;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class StatisticsFileReader extends PlayersNamesAndScores {

    private static Scanner statisticsFileReader;
    private static StringBuffer playersNamesAndScores;

    public StatisticsFileReader() {
        playersNamesAndScores = new StringBuffer();
        playersAndScoresMap = new HashMap<>();
    }

    public void initStatisticsFileReader() {
        try {
            statisticsFileReader = new Scanner(new FileReader(statisticsFilePath));
        } catch (FileNotFoundException ex) {
            System.out.println("Exception at statistics file reader" + ex);
        }
    }

    public void readStatisticsFile() {
        initStatisticsFileReader();
        while (statisticsFileReader.hasNextLine())
            playersNamesAndScores.append(statisticsFileReader.nextLine() + " ");

        String playersAndScores = playersNamesAndScores.toString();
        String playersAndScoresArray[] = playersAndScores.split(" ");

        for(int i=0; i<playersAndScoresArray.length-1; i+=2)
            playersAndScoresMap.put(playersAndScoresArray[i], playersAndScoresArray[i+1]);

        statisticsFileReader.close();
    }
}
