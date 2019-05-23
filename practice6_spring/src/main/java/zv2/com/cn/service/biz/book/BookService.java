package zv2.com.cn.service.biz.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import zv2.com.cn.dao.biz.book.BookDao;
import zv2.com.cn.entity.biz.book.Book;

/**
 * @author lb
 * @date 2019/5/24
 */
@Transactional
@Service(value = "bookService")
public class BookService {
    @Autowired
    @Qualifier(value = "bookDao")
    private BookDao bookDao;

    public void add(Book book) {
        System.out.println("BookService >>> add..");
        bookDao.save(book);
    }
}
