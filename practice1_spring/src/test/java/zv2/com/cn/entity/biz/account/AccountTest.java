package zv2.com.cn.entity.biz.account;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lb
 * @date 2019/5/14
 */
public class AccountTest {
    @Test
    public void testAccountConstructor() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Account account = (Account) context.getBean("account");
        System.out.println(account.getId()+"-"+account.getDeposit());
    }
}
