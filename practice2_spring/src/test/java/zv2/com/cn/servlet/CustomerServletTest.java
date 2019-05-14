package zv2.com.cn.servlet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zv2.com.cn.service.usr.customer.CustomerService;

/**
 * Spring和Junit整合测试
 * @author lb
 * @date 2019/5/15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class CustomerServletTest {
    @Autowired
    private CustomerService customerService;
    @Test
    public void test() {
        System.out.println(customerService.printOrdersForCustomer());
    }
}
