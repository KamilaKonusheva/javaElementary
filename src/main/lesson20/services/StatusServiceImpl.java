package lesson20.services;

import lesson20.dao.StatusDao;
import lesson20.dao.StatusDaoImpl;
import lesson20.entities.Status;
import org.apache.log4j.Logger;

public class StatusServiceImpl implements StatusService {
    Logger logger = Logger.getLogger(StatusServiceImpl.class);

    @Override
    public void save(Status status) {
        logger.debug(status.toString());
        if (status == null) {
            System.out.println("Status is empty");
            return;
        }
        StatusDao statusDao = new StatusDaoImpl();
        statusDao.save(status);
    }

    @Override
    public void update(Status status) {
        logger.debug(status.toString());
        if (status == null) {
            System.out.println("Status is empty");
            return;
        }
        StatusDao statusDao = new StatusDaoImpl();
        statusDao.update(status);
    }

    @Override
    public Status getById(int id) {
        logger.debug(id);
        StatusDao statusDao = new StatusDaoImpl();
        return statusDao.getById(id);
    }

    @Override
    public void delete(Status status) {
        logger.debug(status.toString());
        if (status == null) {
            System.out.println("Status is empty");
            return;
        }
        StatusDao statusDao = new StatusDaoImpl();
        statusDao.delete(status);
    }
}
