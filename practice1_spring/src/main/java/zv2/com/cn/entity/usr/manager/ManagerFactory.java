package zv2.com.cn.entity.usr.manager;

/**
 * @author lb
 * @date 2019/5/14
 */
public class ManagerFactory {
    /**
     * 使用静态工厂方式获取bean实例对象
     * @return
     */
    public static Manager getManager() {
        System.out.println("ManagerFactory getManager...");
        return new Manager();
    }

    /**
     * 通过实例工厂方式获取bean实例化对象
     * @return
     */
    public Manager manager() {
        System.out.println("managerFactory manager...");
        return new Manager();
    }
}
