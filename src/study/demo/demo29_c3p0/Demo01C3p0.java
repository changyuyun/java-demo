package study.demo.demo29_c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

//c3p0演示
public class Demo01C3p0 {
    public static void main(String[] args) throws SQLException {
        //创建连接对象
        DataSource ds = new ComboPooledDataSource();
        //获取连接对象
        Connection conn = ds.getConnection();

        System.out.println(conn);

    }
}
