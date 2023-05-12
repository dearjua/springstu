package com.dearjua.jdbc.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public int queryPriceByBookid(Integer bookId) {
        String sql = "SELECT price FROM t_book WHERE book_id = ?";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class,bookId);
        return integer;
    }

    @Override
    public void updateBookStock(Integer bookNum, Integer bookId) {
        String sql = "UPDATE t_book SET stock=stock-? WHERE book_id=?";
        jdbcTemplate.update(sql,bookNum,bookId);
    }

    @Override
    public void updateUserBalance(Integer user_id, int price) {
        String sql = "update t_user set balance=balance-? where user_id=?";
        jdbcTemplate.update(sql,price,user_id);
    }
}
