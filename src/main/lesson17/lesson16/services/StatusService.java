package lesson17.lesson16.services;

import lesson17.lesson16.entities.Status;

public interface StatusService {
    void save(Status status);

    void update(Status status);

    Status getById(int id);

    void delete(Status status);
}
