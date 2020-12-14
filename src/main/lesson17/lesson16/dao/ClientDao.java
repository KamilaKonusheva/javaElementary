package lesson17.lesson16.dao;

import lesson17.lesson16.entities.Client;

public interface ClientDao {
    void save(Client client);

    void update(Client client);

    Client getById(int id);

    void delete(Client client);
}
