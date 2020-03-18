package study.demo.demo30_druid;

import study.demo.util.JDBCUtils2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//工具类的演示
public class Demo02Druid {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;
        try {
            conn = JDBCUtils2.getConnection();
            String sql = "select * from account where id=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,1);
            resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getDouble("money"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils2.close(resultSet, pstmt, conn);
        }


    }
}
