package zv2.com.cn.entity.usr.manager;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author lb
 * @date 2019/5/13
 */
public class ManagerTest {
    @Test
    public void testManagerConstructor() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Manager manager = (Manager) context.getBean("manager");
        System.out.println(manager.getUsername()+":"+manager.getPassword());
    }
    @Test
    public void testScope() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Manager manager = (Manager) context.getBean("manager");
        Manager manager2 = (Manager) context.getBean("manager");
        System.out.println(manager == manager2);
    }
    @Test
    public void testManagerInitMethod() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Manager manager = (Manager) context.getBean("manager");
        System.out.println(manager.getUsername()+":"+manager.getPassword());
        context.close();
    }
}
