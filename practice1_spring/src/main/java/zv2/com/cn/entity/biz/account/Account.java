package zv2.com.cn.entity.biz.account;

/**
 * @author lb
 * @date 2019/5/14
 */
public class Account {
    private String id;
    private String deposit;
    private String gmtCreate;
    private String gmtModified;

    public Account() {
        super();
    }

    public Account(String id, String deposit, String gmtCreate, String gmtModified) {
        super();
        this.id = id;
        this.deposit = deposit;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
    }
}
