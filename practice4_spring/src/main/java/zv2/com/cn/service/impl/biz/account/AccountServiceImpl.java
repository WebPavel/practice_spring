package zv2.com.cn.service.impl.biz.account;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import zv2.com.cn.dao.biz.account.AccountDao;
import zv2.com.cn.service.biz.account.AccountService;

/**
 * @author lb
 * @date 2019/5/22
 */
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = false)
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    /**
     * 转账
     * @param from 汇款人
     * @param to 收款人
     * @param amount 金额
     */
    @Override
    public void transfer(final String from, final String to, final Double amount) {
        accountDao.out(from, amount);
        int i = 1/0;
        accountDao.in(to, amount);
    }
}


//public class AccountServiceImpl implements AccountService {
//    private AccountDao accountDao;
//    private TransactionTemplate transactionTemplate;
//
//    public void setAccountDao(AccountDao accountDao) {
//        this.accountDao = accountDao;
//    }
//
//    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
//        this.transactionTemplate = transactionTemplate;
//    }
//
//    /**
//     * 转账
//     * @param from 汇款人
//     * @param to 收款人
//     * @param amount 金额
//     */
//    @Override
//    public void transfer(final String from, final String to, final Double amount) {
//        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
//            @Override
//            protected void doInTransactionWithoutResult(TransactionStatus status) {
//                accountDao.out(from, amount);
//                int i = 1/0;
//                accountDao.in(to, amount);
//            }
//        });
//    }
//}