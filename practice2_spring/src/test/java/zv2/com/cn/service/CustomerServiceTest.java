package zv2.com.cn.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zv2.com.cn.service.usr.customer.CustomerService;

/**
 * @author lb
 * @date 2019/5/14
 */
public class CustomerServiceTest {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");
        System.out.println(customerService);
    }
    @Test
    public void testWithoutProxy() {
        CustomerService customerService = new CustomerService();
        customerService.printOrdersForCustomer();
        customerService.delete();
    }
    @Test
    public void testCGlib() {
        CustomerService customerService = new CustomerService();
        CustomerService proxy = new CGlibProxy(customerService).createProxy();
        proxy.printOrdersForCustomer();
        proxy.delete();
    }
}
