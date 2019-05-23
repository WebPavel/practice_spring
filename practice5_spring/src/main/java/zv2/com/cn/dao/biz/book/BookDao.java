package zv2.com.cn.dao.biz.book;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import zv2.com.cn.entity.biz.book.Book;

import java.util.List;

/**
 * @author lb
 * @date 2019/5/23
 */
public class BookDao extends HibernateDaoSupport {
    public void save(Book book) {
        System.out.println("BookDao >>> save..");
        this.getHibernateTemplate().save(book);
    }
    public void update(Book book) {
        System.out.println("BookDao >>> update..");
        this.getHibernateTemplate().update(book);
    }
    public void delete(Book book) {
        System.out.println("BookDao >>> delete..");
        this.getHibernateTemplate().delete(book);
    }
    public Book findById(String id) {
        System.out.println("BookDao >>> findById..");
        return getHibernateTemplate().get(Book.class, id);
    }
    public List<Book> findAll() {
        System.out.println("BookDao >>> findAll..");
        return getHibernateTemplate().find("from Book");
    }
    public List<Book> findByCriteria(DetachedCriteria detachedCriteria) {
        System.out.println("BookDao >>> findByCriteria..");
        return getHibernateTemplate().findByCriteria(detachedCriteria);
    }
    public List<Book> findByName(String name) {
        System.out.println("BookDao >>> findByName..");
        return getHibernateTemplate().findByNamedQuery("findByName", name);
    }
    public Book findByIdLazy(String id) {
        System.out.println("BookDao >>> findByIdLazy..");
        return getHibernateTemplate().load(Book.class, id);
    }
}
