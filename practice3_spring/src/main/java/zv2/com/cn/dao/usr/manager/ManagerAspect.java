package zv2.com.cn.dao.usr.manager;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面类
 * @author lb
 * @date 2019/5/19
 */
public class ManagerAspect {
    public void before() {
        System.out.println("前置通知...");
    }
    public void afterReturning(Object returning) {
        System.out.println("后置通知..." + returning);
    }
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知前...");
        Object ret = proceedingJoinPoint.proceed();
        System.out.println("环绕通知后...");
        return ret;
    }
    public void afterThrowing(Throwable throwing) {
        System.out.println("出错啦..." + throwing.getMessage());
    }
    public void after() {
        System.out.println("最终通知...");
    }
}
