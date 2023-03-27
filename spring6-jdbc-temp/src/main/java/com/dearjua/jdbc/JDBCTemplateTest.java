package com.dearjua.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@SpringJUnitConfig(locations = "classpath:beans.xml")
public class JDBCTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    public void updates(){
        String sql = "insert into t_emp values(null,?,?,?)";
        int result = jdbcTemplate.update(sql,"张三",24,"y");
        System.out.println(result);
    }
    @Test
    public void selects(){
        //写法一
        String sql = "select * from t_emp where id = ?";
       /* Emp o = jdbcTemplate.queryForObject(sql,(rs,rowNum) -> {
            Emp emp = new Emp();
            emp.setId(rs.getInt("id"));
            emp.setAge(rs.getInt("age"));
            emp.setName(rs.getString("name"));
            emp.setSex(rs.getString("sex"));
            return emp;
        },1001);
        System.out.println(o);*/

        //写法二，使用提供的实现类封装对象
        Emp emp = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Emp.class),1001);
        System.out.println(emp);
    }

    //查询返回List集合
    @Test
    public void testSelectList(){
        String sql = "select * from t_emp";
        List<Emp> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        System.out.println(query);
    }

    //查询返回单个值
    @Test
    public void testSelectSingle(){
        String sql = "select count(*) from t_emp";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(integer);
    }

}
