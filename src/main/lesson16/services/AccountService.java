package lesson16.services;

import lesson16.entities.Account;

public interface AccountService {
    void save(Account account);

    void update(Account account);

    Account getById(int id);

    void delete(Account account);
}
