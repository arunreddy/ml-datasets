package ml.arunreddy.research.datasets.impl;

import com.ohmdb.api.Db;
import com.ohmdb.api.Ohm;

/**
 * Created by arun on 6/25/15.
 */
public abstract class AbstractDataImporter {

  protected Db db;

  /**
   * Constructor takes the filename of ohmdb, which typically resides in the root directory of the project/sub-module.
   *
   * @param dbName filename of the ohdb database.
   */
  public AbstractDataImporter(String dbName){
    this.db = Ohm.db(dbName);
  }


  /**
   * Finalize Class - Shutdown the DB after its use.
   * @throws Throwable
   */
  protected void finalize() throws Throwable{
    if(db!=null){
      db.shutdown();
    }
  }
}
