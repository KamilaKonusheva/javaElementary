package lesson20.services;

import lesson20.entities.Client;

public interface ClientService {
    void save(Client client);

    void update(Client client);

    Client getById(int id);

    void delete(Client client);
}
