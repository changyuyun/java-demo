package study.demo.demo28_jdbc;

import study.demo.util.JDBCUtils;

import java.sql.*;

//演示连接工具
public class Demo05Jdbc {
    public static void main(String[] args) throws SQLException {
        //注册驱动
        Connection conn = JDBCUtils.getConnection();
        String sql = "select * from account";

        Statement statement = conn.createStatement();
        //结果集对象 封装查询结果
        ResultSet resultSet = statement.executeQuery(sql);
        //放到集合中
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id"));
            System.out.println(resultSet.getString("name"));
            System.out.println(resultSet.getFloat("money"));
        }
        JDBCUtils.close(resultSet, statement, conn);
    }
}
