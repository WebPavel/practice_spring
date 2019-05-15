package zv2.com.cn.dao.usr.employee;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 切面类：通知织入切点
 * @author lb
 * @date 2019/5/16
 */
@Aspect
public class EmployeeAspect {
    @Before(value = "execution(* zv2.com.cn.dao.usr.employee.EmployeeDao.add(..))")
    public void before() {
        System.out.println("前置增强...");
    }
}
