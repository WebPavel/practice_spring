package zv2.com.cn.action.biz.book;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import zv2.com.cn.entity.biz.book.Book;
import zv2.com.cn.service.biz.book.BookService;

/**
 * @author lb
 * @date 2019/5/22
 */
public class BookAction extends ActionSupport implements ModelDriven<Book> {
    /** 自动装配，由于Struts2-spring-plugin作用，开启Struts配置常量struts.objectFactory=spring，导致default.properties中被屏蔽的struts.objectFactory生效 */
    private BookService bookService;

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    private Book book = new Book();
    @Override
    public Book getModel() {
        return book;
    }
    public String add() {
        System.out.println("BookAction >>> add..");
        bookService.add(book);
        return NONE;
    }
    public String findByIdLazy() {
        System.out.println("BookAction >>> findByIdLazy..");
        Book book = bookService.findByIdLazy("402881e66ae08fd7016ae09097f10000");
        System.out.println(book.getName()+" | "+book.getAuthor()+" | "+book.getPress());
        return NONE;
    }
}
