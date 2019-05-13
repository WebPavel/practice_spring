package zv2.com.cn.entity.usr.customer;

import zv2.com.cn.entity.biz.account.Account;

/**
 * @author lb
 * @date 2019/5/14
 */
public class Customer {
    private String id;
    private String username;
    private String nickname;
    private String password;
    private Account account;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
