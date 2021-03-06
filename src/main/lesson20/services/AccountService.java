package lesson20.services;

import lesson20.entities.Account;

public interface AccountService {
    void save(Account account);

    void update(Account account);

    Account getById(int id);

    void delete(Account account);
}
