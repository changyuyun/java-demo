package study.demo.demo28_jdbc;

import study.demo.util.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
//登陆案例
public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = scan.nextLine();
        System.out.println("请输入密码：");
        String pwd = scan.nextLine();
        boolean ret = login(name, pwd);
        if (!ret) {
            System.out.println("登陆失败");
        } else {
            System.out.println("登陆成功");
        }
    }

    public static boolean login(String name, String pwd) {
        if (name == null || pwd == null) {
            return false;
        }
        Connection conn = null;
        Statement stmt = null;
        ResultSet resultSet = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "select * from user where name='" + name + "' and pwd='" + pwd + "'";
            stmt = conn.createStatement();
            resultSet = stmt.executeQuery(sql);
            if (!resultSet.next()) {
                return false;
            }
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            JDBCUtils.close(resultSet,stmt, conn);
        }
    }
}
