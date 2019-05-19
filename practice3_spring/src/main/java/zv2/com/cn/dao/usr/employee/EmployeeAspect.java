package zv2.com.cn.dao.usr.employee;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 切面类：通知织入切点
 * @author lb
 * @date 2019/5/16
 */
@Aspect
public class EmployeeAspect {
    /** 前置通知无法阻止目标方法的执行 */
    @Before(value = "execution(* zv2.com.cn.dao.usr.employee.EmployeeDao.add(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("前置增强..." + joinPoint);
    }

    /** 可以获取目标方法的返回值 */
    @AfterReturning(value = "execution(* zv2.com.cn.dao.usr.employee.EmployeeDao.update(..))", returning = "returning")
    public void afterReturning(JoinPoint joinPoint, Object returning) {
        System.out.println("后置增强..." + joinPoint + ", return " + returning);
    }

    /** 环绕增强可以阻止目标方法的执行 */
    @Around(value = "EmployeeAspect.pointcut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前增强...");
        Object ret = proceedingJoinPoint.proceed();
        System.out.println("环绕后增强...");
        return ret;
    }

    @AfterThrowing(value = "EmployeeAspect.pointcut()", throwing = "throwing")
    public void afterThrowing(Throwable throwing) {
        System.out.println("出错啦..." + throwing.getMessage());
    }

    @After(value = "EmployeeAspect.pointcut()")
    public void after() {
        System.out.println("最终通知...");
    }

    /** 定义切点 */
    @Pointcut(value = "execution(* zv2.com.cn.dao.usr.employee.EmployeeDao.find(..))")
    private void pointcut() {
    }
}
