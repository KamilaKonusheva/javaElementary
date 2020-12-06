package lesson16.services;

import lesson16.entities.Client;

public interface ClientService {
    void save(Client client);

    void update(Client client);

    Client getById(int id);

    void delete(Client client);
}
