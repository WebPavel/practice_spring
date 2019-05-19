package zv2.com.cn.dao.usr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zv2.com.cn.dao.usr.employee.EmployeeDao;
import zv2.com.cn.entity.usr.employee.Employee;

import java.util.List;

/**
 * @author lb
 * @date 2019/5/20
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-db.xml")
public class UsrEmployeeDaoTest {
    @Autowired
    @Qualifier("employeeDao")
    private EmployeeDao employeeDao;
    @Test
    public void testAdd() {
        Employee employee = new Employee();
        employee.setId("z09bo7");
        employee.setName("guest");
        employee.setPassword("123456");
        employeeDao.add(employee);
    }
    @Test
    public void testUpdate() {
        Employee employee = new Employee();
        employee.setId("z09bo7");
        employee.setPassword("guest");
        employeeDao.update(employee);
    }
    @Test
    public void testDelete() {
        Employee employee = new Employee();
        employee.setId("z09bo7");
        employeeDao.delete(employee);
    }
    @Test
    public void testCountRows() {
        System.out.println(employeeDao.countRows());
    }
    @Test
    public void testFindPasswordByName() {
        String name = "admin";
        System.out.println(employeeDao.findPasswordByName(name));
    }
    @Test
    public void testFindById() {
        Employee employee = employeeDao.findById("a90b81gol");
        System.out.println(employee.getName() + "::" + employee.getPassword());
    }
    @Test
    public void testFindAll() {
        List<Employee> employees = employeeDao.findAll();
        for (Employee employee : employees) {
            System.out.println(employee.getId() + "-" + employee.getName() + "::" + employee.getPassword());
        }
    }
}
