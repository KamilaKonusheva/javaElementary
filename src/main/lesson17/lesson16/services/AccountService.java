package lesson17.lesson16.services;

import lesson17.lesson16.entities.Account;

public interface AccountService {
    void save(Account account);

    void update(Account account);

    Account getById(int id);

    void delete(Account account);
}
