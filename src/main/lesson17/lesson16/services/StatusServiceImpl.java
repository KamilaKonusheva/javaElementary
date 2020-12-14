package lesson17.lesson16.services;

import lesson17.lesson16.dao.StatusDao;
import lesson17.lesson16.dao.StatusDaoImpl;
import lesson17.lesson16.entities.Status;

public class StatusServiceImpl implements StatusService {
    @Override
    public void save(Status status) {
        if (status == null) {
            System.out.println("Status is empty");
            return;
        }
        StatusDao statusDao = new StatusDaoImpl();
        statusDao.save(status);
    }

    @Override
    public void update(Status status) {
        if (status == null) {
            System.out.println("Status is empty");
            return;
        }
        StatusDao statusDao = new StatusDaoImpl();
        statusDao.update(status);
    }

    @Override
    public Status getById(int id) {
        StatusDao statusDao = new StatusDaoImpl();
        return statusDao.getById(id);
    }

    @Override
    public void delete(Status status) {
        if (status == null) {
            System.out.println("Status is empty");
            return;
        }
        StatusDao statusDao = new StatusDaoImpl();
        statusDao.delete(status);
    }
}
