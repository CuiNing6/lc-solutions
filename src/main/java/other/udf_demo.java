package other;
import org.apache.hadoop.hive.ql.exec.UDF;


public final class udf_demo extends UDF {

    public static String split(int end) {
        String str = new String();
        for (int i = 0; i <= end; i++) {
            if (i == 1) {
                str = Integer.toString(i);
            } else {
                str = str + "," + Integer.toString(i);
            }
        }
        return str;
    }

    public String evaluate(int end) {
        String list = split(end);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(split(10));
    }
}
