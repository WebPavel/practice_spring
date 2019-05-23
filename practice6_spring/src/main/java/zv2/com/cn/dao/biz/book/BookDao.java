package zv2.com.cn.dao.biz.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import zv2.com.cn.entity.biz.book.Book;

/**
 * @author lb
 * @date 2019/5/24
 */
@Repository(value = "bookDao")
public class BookDao {
    @Autowired
    @Qualifier(value = "hibernateTemplate")
    private HibernateTemplate hibernateTemplate;

    public void save(Book book) {
        System.out.println("BookDao >>> save..");
        hibernateTemplate.save(book);
    }
}
