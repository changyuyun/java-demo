package study.demo.demo28_jdbc;

import study.demo.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 事务
 */
public class Demo06Jdbc {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        PreparedStatement preparedStatement2 = null;
        String sql1 = "update account set money=money-? where id=?";
        String sql2 = "update account set money=money+? where id=?";
        try {
            conn = JDBCUtils.getConnection();
            conn.setAutoCommit(false);
            preparedStatement = conn.prepareStatement(sql1);
            preparedStatement.setDouble(1, 1);
            preparedStatement.setInt(2, 1);
            preparedStatement2 = conn.prepareStatement(sql2);
            preparedStatement2.setDouble(1, 1);
            preparedStatement2.setInt(2,2);

            int ret1 = preparedStatement.executeUpdate();
            int ret2 = preparedStatement2.executeUpdate();
            System.out.println("结果1:"+ret1);
            System.out.println("结果2:"+ret2);
            conn.commit();
        } catch (Exception e) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            JDBCUtils.close(null,preparedStatement, conn);
            JDBCUtils.close(null,preparedStatement2, null);
        }

    }
}
