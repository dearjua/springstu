package com.dearjua.jdbc.tx.service;

import com.dearjua.jdbc.tx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class BookServiceImpl implements BookService{

    @Autowired
    private BookDao bookDao;
    @Transactional()
    @Override
    public void BuyBook(Integer id, Integer bookId,Integer bookNum) {

        //根据图书id查询图书价格
        int price = bookDao.queryPriceByBookid(bookId);

        //更新t_book表的图书库存
        bookDao.updateBookStock(bookNum,bookId);
        //更新读者余额
        while(bookNum>0){
            bookDao.updateUserBalance(id,price);
            bookNum--;
        }
    }
}
