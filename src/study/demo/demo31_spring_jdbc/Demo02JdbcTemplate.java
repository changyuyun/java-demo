package study.demo.demo31_spring_jdbc;

import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import study.demo.util.JDBCUtils2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class Demo02JdbcTemplate {
    @Test
    public void test1() {
        //修改
        JdbcTemplate template = new JdbcTemplate(JDBCUtils2.getDataSource());
        String sql = "update account set money=10000 where id=?";
        int ret = template.update(sql, 1);
        System.out.println(ret);
    }
    @Test
    public void test2() {
        //添加
        JdbcTemplate template = new JdbcTemplate(JDBCUtils2.getDataSource());
        String sql = "insert into account (id,name,money) values(?, ?,?)";
        int ret = template.update(sql, null, "song", 10);
        System.out.println(ret);
    }
    @Test
    public void test3() {
        //delete
        JdbcTemplate template = new JdbcTemplate(JDBCUtils2.getDataSource());
        String sql = "delete from account where id=?";
        int ret = template.update(sql, 3);
        System.out.println(ret);
    }
    @Test
    public void test4() {
        //查询一条为map
        JdbcTemplate template = new JdbcTemplate(JDBCUtils2.getDataSource());
        String sql = "select * from account where id=?";
        Map<String, Object> map = template.queryForMap(sql, 1);
        Set<String> strings = map.keySet();
        for (String string : strings) {
            System.out.println(string+"============="+map.get(string));
        }
    }

    @Test
    public void test5() {
        //查询所有的记录，为list 最常用的查询方式
        JdbcTemplate template = new JdbcTemplate(JDBCUtils2.getDataSource());
        String sql = "select * from account";
        List<Map<String, Object>> list = template.queryForList(sql);
        System.out.println(list);
    }
    @Test
    public void test6() {
        //查询所有的记录 重点
        JdbcTemplate template = new JdbcTemplate(JDBCUtils2.getDataSource());
        String sql = "select * from account";
        List<Account> query = template.query(sql, new BeanPropertyRowMapper<Account>(Account.class));
        for (Account account : query) {
            System.out.println(account);
        }
    }
    @Test
    public void test7() {
        //查询记录数
        JdbcTemplate template = new JdbcTemplate(JDBCUtils2.getDataSource());
        String sql = "select count(id) as num from account";
        //执行聚合函数
        Long count = template.queryForObject(sql, Long.class);
        System.out.println(count);
    }

}
