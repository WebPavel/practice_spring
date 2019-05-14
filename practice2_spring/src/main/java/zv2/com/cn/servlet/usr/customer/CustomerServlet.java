package zv2.com.cn.servlet.usr.customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import zv2.com.cn.service.usr.customer.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author lb
 * @date 2019/5/14
 */
public class CustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");
//        System.out.println(customerService.printOrdersForCustomer());

//        WebApplicationContext applicationContext = (WebApplicationContext) getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
//        CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");
//        System.out.println(customerService.printOrdersForCustomer());
        WebApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
        CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");
        System.out.println(customerService.printOrdersForCustomer());
    }
}
