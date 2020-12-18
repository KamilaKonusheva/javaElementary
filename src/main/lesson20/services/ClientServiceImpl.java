package lesson20.services;

import lesson20.utils.Database;
import lesson20.dao.ClientDao;
import lesson20.dao.ClientDaoImpl;
import lesson20.entities.Client;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientServiceImpl implements ClientService {
    Logger logger = Logger.getLogger(ClientServiceImpl.class);

    private static final String PHONE_SEARCH = "SELECT * FROM clients WHERE phone = ?";

    @Override
    public void save(Client client) {
        logger.debug(client.toString());
        if (client == null) {
            System.out.println("Client is empty");
            return;
        }
        ClientDao clientDao = new ClientDaoImpl();
        clientDao.save(client);
    }

    @Override
    public void update(Client client) {
        logger.debug(client.toString());
        if (client == null) {
            System.out.println("Client is empty");
            return;
        }
        ClientDao clientDao = new ClientDaoImpl();
        clientDao.update(client);
    }

    @Override
    public Client getById(int id) {
        logger.debug(id);
        ClientDao clientDao = new ClientDaoImpl();
        return clientDao.getById(id);
    }

    @Override
    public void delete(Client client) {
        logger.debug(client.toString());
        if (client == null) {
            System.out.println("Client is empty");
            return;
        }
        ClientDao clientDao = new ClientDaoImpl();
        clientDao.delete(client);
    }
}
