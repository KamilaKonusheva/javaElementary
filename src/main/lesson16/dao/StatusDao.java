package lesson16.dao;

import lesson16.entities.Status;

public interface StatusDao {
    void save(Status status);

    void update(Status status);

    Status getById(int id);

    void delete(Status status);
}
