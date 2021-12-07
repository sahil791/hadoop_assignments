package Assignment2b;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.mapreduce.LoadIncrementalHFiles;
import org.apache.hadoop.hbase.tool.*;

public class HBaseBulkLoad {

    public static void doBulkLoad(String pathToHFile, String tableName, RegionLocator regionLocator) {
        try {
            Configuration configuration = new Configuration();
            configuration.set("mapreduce.child.java.opts", "-Xmx1g");
            HBaseConfiguration.addHbaseResources(configuration);
            LoadIncrementalHFiles loadFfiles = new LoadIncrementalHFiles(configuration);
            Connection connection = ConnectionFactory.createConnection(configuration);
            Table table = connection.getTable(TableName.valueOf(tableName));
            loadFfiles.doBulkLoad(new Path(pathToHFile),connection.getAdmin(),table,regionLocator);
            System.out.println("Bulk Load Completed..");
        } catch(Exception exception) {
            exception.printStackTrace();
        }
    }
}
