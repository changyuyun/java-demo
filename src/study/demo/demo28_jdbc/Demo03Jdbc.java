package study.demo.demo28_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//添加一条记录
public class Demo03Jdbc {
    public static void main(String[] args) {
        Statement statement = null;
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "insert into account values(null,'tu', 3000)";
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/welive?characterEncoding=utf8&useSSL=false",
                    "root",
                    "root"
            );
            statement = conn.createStatement();
            int count = statement.executeUpdate(sql);
            System.out.println(count);
            if (count > 0) {
                System.out.println("success!");
            } else {
                System.out.println("failed!");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
