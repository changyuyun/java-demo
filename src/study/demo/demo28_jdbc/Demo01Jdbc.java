package study.demo.demo28_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//数据库实例 connect and update
public class Demo01Jdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.导入驱动jar包

        //2.注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //3.获取数据库的链接对象
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/welive?characterEncoding=utf8&useSSL=false",
                "root",
                "root");


        //4.定义sql语句
        String sql = "update account set money = 1000 where id = 1";

        //5.获取sql对象 Statement
        Statement stmt = conn.createStatement();
        //6.执行sql
        int ret = stmt.executeUpdate(sql);

        System.out.println(ret);

        //7.释放资源
        stmt.close();
        conn.close();
    }
}
