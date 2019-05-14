package zv2.com.cn.utils;

import zv2.com.cn.entity.biz.account.Account;

import java.nio.charset.StandardCharsets;
import java.util.Date;

/**
 * @author lb
 * @date 2019/5/14
 */
public class InstanceFactory {
    public Account account() {
        Account account = new Account();
        account.setDeposit(0.00);
        account.setGmtCreate(new Date().toGMTString());
        account.setGmtModified(new Date().toGMTString());
        return account;
    }

    public static String defaultCharset() {
        return StandardCharsets.UTF_8.name();
    }
}
