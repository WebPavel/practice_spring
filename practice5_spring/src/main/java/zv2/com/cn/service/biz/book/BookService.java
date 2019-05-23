package zv2.com.cn.service.biz.book;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.transaction.annotation.Transactional;
import zv2.com.cn.dao.biz.book.BookDao;
import zv2.com.cn.entity.biz.book.Book;

import java.util.List;

/**
 * @author lb
 * @date 2019/5/23
 */
@Transactional(rollbackFor = {})
public class BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void add(Book book) {
        System.out.println("BookService >>> add..");
        bookDao.save(book);
    }
    public void update(Book book) {
        System.out.println("BookService >>> update..");
        bookDao.update(book);
    }
    public void delete(Book book) {
        System.out.println("BookService >>> delete..");
        bookDao.delete(book);
    }
    public Book findById(String id) {
        System.out.println("BookService >>> findById..");
        return bookDao.findById(id);
    }
    public List<Book> findAll() {
        System.out.println("BookService >>> findAll..");
        return bookDao.findAll();
    }
    public List<Book> findByCriteria(DetachedCriteria detachedCriteria) {
        System.out.println("BookService >>> findByCriteria..");
        return bookDao.findByCriteria(detachedCriteria);
    }
    public List<Book> findByName(String name) {
        System.out.println("BookService >>> findByName..");
        return bookDao.findByName(name);
    }
    public Book findByIdLazy(String id) {
        System.out.println("BookService >>> findByIdLazy..");
        return bookDao.findByIdLazy(id);
    }
}
