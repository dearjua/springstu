package com.dearjua.jdbc.tx.dao;

public interface BookDao {
    int queryPriceByBookid(Integer bookId);

    void updateBookStock(Integer bookNum, Integer bookId);

    void updateUserBalance(Integer user_id, int price);
}
