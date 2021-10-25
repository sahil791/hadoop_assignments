package Assignment2b;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.mapreduce.LoadIncrementalHFiles;
import org.apache.hadoop.hbase.tool.*;

public class HBaseBulkLoad {
    /**
     * doBulkLoad.
     *
     * @param pathToHFile path to hfile
     * @param tableName
     */
    public static void doBulkLoad(String pathToHFile, String tableName, RegionLocator regionLocator) {
        try {
            Configuration configuration = new Configuration();
            configuration.set("mapreduce.child.java.opts", "-Xmx1g");
            HBaseConfiguration.addHbaseResources(configuration);
            LoadIncrementalHFiles loadFfiles = new LoadIncrementalHFiles(configuration);
            //BulkLoadHFiles bulkLoaddHFiles = new BulkLoadHFiles();
            Connection connection = ConnectionFactory.createConnection(configuration);
            //HTable hTable = new HTable(configuration, tableName);
            Table table = connection.getTable(TableName.valueOf(tableName));
            //RegionLocator regionlocator = connection.getRegionLocator(TableName.valueOf("peoples"));
            loadFfiles.doBulkLoad(new Path(pathToHFile),connection.getAdmin(),table,regionLocator);
            System.out.println("Bulk Load Completed..");
        } catch(Exception exception) {
            exception.printStackTrace();
        }
    }
}
