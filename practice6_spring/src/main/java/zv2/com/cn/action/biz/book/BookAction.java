package zv2.com.cn.action.biz.book;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import zv2.com.cn.entity.biz.book.Book;
import zv2.com.cn.service.biz.book.BookService;

/**
 * @author lb
 * @date 2019/5/24
 */
@Namespace(value = "/biz/book")
@ParentPackage(value = "struts-default")
@Controller(value = "bookAction")
@Scope(value = "prototype")
public class BookAction extends ActionSupport implements ModelDriven<Book> {
    private Book book = new Book();
    @Autowired
    @Qualifier("bookService")
    private BookService bookService;
    @Override
    public Book getModel() {
        return book;
    }

    @Action(value = "book_add")
    public String add() {
        System.out.println("BookAction >>> add..");
        bookService.add(book);
        return NONE;
    }
}
