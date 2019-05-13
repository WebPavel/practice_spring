package zv2.com.cn.entity.usr.customer;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lb
 * @date 2019/5/14
 */
public class CustomerTest {
    @Test
    public void testCustomerAttributeInject() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Customer customer = (Customer) context.getBean("customer");
        System.out.println(customer.getNickname()+":"+customer.getPassword()+"-"+customer.getAccount().getDeposit());
    }
}
