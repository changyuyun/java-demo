package study.demo.demo29_c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

//验证配置
public class Demo02C3p0 {
    public static void main(String[] args) throws SQLException {
        //使用默认配置default-config 可以传递configName
        // DataSource ds = new ComboPooledDataSource();
        DataSource ds = new ComboPooledDataSource("otherc3p0");

        for (int i = 1; i <= 11;i++) {
            Connection conn = ds.getConnection();
            System.out.println(conn);
            if (i == 5 || i == 10 || i == 8) {
                conn.close();//归还到连接池中
            }
        }
    }
}
