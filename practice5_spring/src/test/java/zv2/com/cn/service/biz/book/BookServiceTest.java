package zv2.com.cn.service.biz.book;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zv2.com.cn.entity.biz.book.Book;

import java.util.List;

/**
 * @author lb
 * @date 2019/5/23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext.xml")
public class BookServiceTest {
    @Autowired
    @Qualifier("bookService")
    private BookService bookService;

    @Test
    public void testUpdate() {
        Book book = new Book();
        book.setId("402881e66ae0d0e1016ae0d179930000");
        book.setPrice(56.20D);
        bookService.update(book);
    }
    @Test
    public void testDelete() {
        Book book = new Book();
        book.setId("402881e66ae0d0e1016ae0d179930000");
        bookService.delete(book);
    }
    @Test
    public void testFindById() {
        String id = "402881e66ae0ce13016ae0ce7d890000";
        Book book = bookService.findById(id);
        System.out.println(book.getName()+" | "+book.getAuthor()+" | "+book.getPress());
    }
    @Test
    public void testFindAll() {
        List<Book> books = bookService.findAll();
        for (Book book : books) {
            System.out.println(book.getName()+" | "+book.getAuthor()+" | "+book.getPress());
        }
    }
    @Test
    public void testFindByCriteria() {
        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Book.class);
        detachedCriteria.add(Restrictions.like("name", "Spring%"));
        List<Book> books = bookService.findByCriteria(detachedCriteria);
        for (Book book : books) {
            System.out.println(book.getName()+" | "+book.getAuthor()+" | "+book.getPress());
        }
    }
    @Test
    public void testFindByName() {
        List<Book> books = bookService.findByName("Spring实战");
        for (Book book : books) {
            System.out.println(book.getName()+" | "+book.getAuthor()+" | "+book.getPress());
        }
    }
}
