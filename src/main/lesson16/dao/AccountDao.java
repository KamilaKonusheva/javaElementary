package lesson16.dao;

import lesson16.entities.Account;

public interface AccountDao {
    void save(Account account);

    void update(Account account);

    Account getById(int id);

    void delete(Account account);
}
