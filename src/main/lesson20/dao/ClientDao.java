package lesson20.dao;

import lesson20.entities.Client;

public interface ClientDao {
    void save(Client client);

    void update(Client client);

    Client getById(int id);

    void delete(Client client);
}
