package Assignment2b;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.KeyValue;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.io.ImmutableBytesWritable;
import org.apache.hadoop.hbase.mapreduce.TableMapper;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.net.TableMapping;

import java.io.IOException;

public class HBaseBulLoadMapper extends TableMapper<ImmutableBytesWritable, Put> {

    public void map(ImmutableBytesWritable row, Result value, Context context) throws IOException, InterruptedException {
        // this example is just copying the data from the source table...
        context.write(row, resultToPut(row,value));
    }

    private static Put resultToPut(ImmutableBytesWritable key, Result result) throws IOException {
        Put put = new Put(key.get());
        for (Cell kv : result.rawCells()) {
            put.add(kv);
        }
        return put;
    }

//    private String hbaseTable;
//    private String dataSeperator;
//    private String columnFamily1;
//    private String columnFamily2;
//    private ImmutableBytesWritable hbaseTableName;
//
//    public void setup(Context context) {
//        Configuration configuration = context.getConfiguration();
//        hbaseTable = configuration.get("hbase.table.name");
//        dataSeperator = configuration.get("data.seperator");
//        columnFamily1 = configuration.get("COLUMN_FAMILY_1");
//        columnFamily2 = configuration.get("COLUMN_FAMILY_2");
//        hbaseTableName = new ImmutableBytesWritable(Bytes.toBytes(hbaseTable));
//    }
//
//    public void map(LongWritable key, Text value, Context context) {
//        try {
//            String[] values = value.toString().split(dataSeperator);
//            String rowKey = values[0];
//            Put put = new Put(Bytes.toBytes(rowKey));
//            put.addColumn(Bytes.toBytes(columnFamily1), Bytes.toBytes("first_name"), Bytes.toBytes(values[1]));
//            put.addColumn(Bytes.toBytes(columnFamily1), Bytes.toBytes("last_name"), Bytes.toBytes(values[2]));
//            put.addColumn(Bytes.toBytes(columnFamily2), Bytes.toBytes("email"), Bytes.toBytes(values[3]));
//            put.addColumn(Bytes.toBytes(columnFamily2), Bytes.toBytes("city"), Bytes.toBytes(values[4]));
//            context.write(hbaseTableName, put);
//        } catch(Exception exception) {
//            exception.printStackTrace();
//        }
//    }
}
