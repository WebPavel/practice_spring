package zv2.com.cn.service;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lb
 * @date 2019/5/14
 */
public class CustomerServiceTest {
    /**
     * bean的生命周期
     */
    @Test
    public void testCustomerService() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService = (CustomerService) context.getBean("customerService");
        customerService.add();
        customerService.find();
        context.close();
    }
}
