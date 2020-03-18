package study.demo.demo31_spring_jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import study.demo.util.JDBCUtils2;

//JdbcTemplate
//update
//queryForMap
//queryForList
//query
//queryForObject
public class Demo01JdbcTemplate {
    public static void main(String[] args) {
        //创建JdbcTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils2.getDataSource());
        //调用方法
        String sql = "update account set money=5000 where id=?";
        int ret = template.update(sql, 1);
        System.out.println(ret);
    }
}
