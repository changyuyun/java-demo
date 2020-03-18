package study.demo.demo30_druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

//druid连接池
public class Demo01Druid {
    public static void main(String[] args) throws Exception {
        //加载配置文件
        Properties properties = new Properties();
        InputStream is = Demo01Druid.class.getClassLoader().getResourceAsStream("druid.properties");
        properties.load(is);
        //获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

        Connection conn = dataSource.getConnection();
        System.out.println(conn);


    }
}
