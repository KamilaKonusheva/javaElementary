package lesson20.services;

import lesson20.dao.AccountDao;
import lesson20.dao.AccountDaoImpl;
import lesson20.entities.Account;
import org.apache.log4j.Logger;


public class AccountServiceImpl implements AccountService {
    Logger logger = Logger.getLogger(AccountServiceImpl.class);
    @Override
    public void save(Account account) {
        logger.debug(account.toString());
        if (account == null) {
            System.out.println("Account is empty");
            return;
        }
        AccountDao accountDao = new AccountDaoImpl();
        accountDao.save(account);
    }

    @Override
    public void update(Account account) {
        logger.debug(account.toString());
        if (account == null) {
            System.out.println("Account is empty");
            return;
        }
        AccountDao accountDao = new AccountDaoImpl();
        accountDao.update(account);
    }

    @Override
    public Account getById(int id) {
        logger.debug(id);
        AccountDao accountDao = new AccountDaoImpl();
        return accountDao.getById(id);
    }

    @Override
    public void delete(Account account) {
        logger.debug(account.toString());
        if (account == null) {
            System.out.println("Account is empty");
            return;
        }
        AccountDao accountDao = new AccountDaoImpl();
        accountDao.delete(account);
    }
}
