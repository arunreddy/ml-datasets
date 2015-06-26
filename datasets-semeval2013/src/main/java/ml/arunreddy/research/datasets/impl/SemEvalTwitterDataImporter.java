package ml.arunreddy.research.datasets.impl;

import java.io.*;

/**
 * Created by arun on 6/25/15.
 */
public class SemEvalTwitterDataImporter extends AbstractDataImporter {

  /**
   * Constructor takes the filename of ohmdb, which typically resides in the root directory of the project/sub-module.
   *
   * @param dbName filename of the ohdb database.
   */
  public SemEvalTwitterDataImporter(String dbName) {
    super(dbName);
  }


  /**
   * @param filePath
   * @param tableName
   */
  public void readSentimentData(String filePath, String tableName) {

    File file = new File(filePath);
    BufferedReader reader = null;
    try {
      reader = new BufferedReader(new FileReader(file));

      if(reader!= null){
        while(reader.ready()){
          String line = reader.readLine();

        }
      }
    } catch (FileNotFoundException e) {
      System.err.println("Given file " + file.getAbsolutePath() + " is not found.");
      e.printStackTrace();
    } catch (IOException e) {
      System.err.println("Error reading the file.");
      e.printStackTrace();
    }


  }

}
