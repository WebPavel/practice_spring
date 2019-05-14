package zv2.com.cn.utils;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zv2.com.cn.entity.biz.account.Account;
import zv2.com.cn.entity.usr.customer.Customer;
import zv2.com.cn.entity.usr.manager.Manager;

/**
 * @author lb
 * @date 2019/5/14
 */
public class BeanConfigTest {
    @Test
    public void testCollectionInjectAttribute() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Account account = (Account) applicationContext.getBean("account");
        Customer customer = (Customer) applicationContext.getBean("customer");
        Manager manager = (Manager) applicationContext.getBean("manager");
        System.out.println(account.getDeposit()+"-"+account.getGmtCreate());
        System.out.println(">>"+customer.getPassword()+"<<");
        System.out.println(manager.getUsername()+"-"+manager.getPassword());
    }
}
