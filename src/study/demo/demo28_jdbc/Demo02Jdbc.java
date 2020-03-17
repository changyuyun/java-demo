package study.demo.demo28_jdbc;

import java.sql.*;
import java.util.Set;

//查询
public class Demo02Jdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //创建链接
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/welive?characterEncoding=utf8&useSSL=false",
                "root",
                "root"
        );
        //事务
        /*connection.setAutoCommit(false);
        connection.commit();
        connection.rollback();*/
        String sql = "select * from account";

        Statement statement = connection.createStatement();
        //结果集对象 封装查询结果
        ResultSet resultSet = statement.executeQuery(sql);
        //放到集合中
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id"));
            System.out.println(resultSet.getString("name"));
            System.out.println(resultSet.getFloat("money"));
        }

        statement.close();
        connection.close();
    }
}
