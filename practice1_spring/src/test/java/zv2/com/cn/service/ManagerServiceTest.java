package zv2.com.cn.service;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

/**
 * @author lb
 * @date 2019/5/13
 */
public class ManagerServiceTest {
    @Test
    public void testInit() {
        /**
         * ApplicationContext继承了BeanFactory,BeanFactory采用了延迟加载的方式，ApplicationContext对BeanFactory进行了扩展
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ManagerService managerService = (ManagerService) context.getBean("managerService");
        managerService.init();
    }
    @Test
    public void testInit2() {
        ApplicationContext context = new FileSystemXmlApplicationContext("applicationContext.xml");
        ManagerService managerService = (ManagerService) context.getBean("managerService");
        managerService.init();
    }
    @Test
    public void testInit3() {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        ManagerService managerService = (ManagerService) beanFactory.getBean("managerService");
        managerService.init();
    }
    @Test
    public void testInit4() {
        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("applicationContext.xml"));
        ManagerService managerService = (ManagerService) beanFactory.getBean("managerService");
        managerService.init();
    }
}
