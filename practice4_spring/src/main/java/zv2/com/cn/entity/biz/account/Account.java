package zv2.com.cn.entity.biz.account;

/**
 * @author lb
 * @date 2019/5/22
 */
public class Account {
    private String id;
    private String name;
    private Double balance;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
