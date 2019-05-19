package zv2.com.cn.dao.usr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zv2.com.cn.dao.usr.manager.ManagerDao;

/**
 * @author lb
 * @date 2019/5/16
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext-peer1.xml")
public class ManagerAspectTest {

    @Autowired
    @Qualifier("managerDao")
    private ManagerDao managerDao;

    @Test
    public void testAspectXML() {
        managerDao.add();
        managerDao.update();
        managerDao.delete();
        managerDao.find();
    }
}
