package zv2.com.cn.entity.usr.manager;

/**
 * @author lb
 * @date 2019/5/13
 */
public class Manager {
    /**
     * 默认使用无参构造获取bean实例对象
     */
    public Manager() {
        super();
        System.out.println("manager constructor execute.");
    }

    public void setup() {
        System.out.println("manager init-method execute.");
    }

    public void teardown() {
        System.out.println("manager destroy-method execute.");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String username;
    private String password;
}
