package lesson16.services;

import lesson13.utils.Database;
import lesson16.dao.ClientDao;
import lesson16.dao.ClientDaoImpl;
import lesson16.entities.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientServiceImpl implements ClientService {
    private static final String PHONE_SEARCH = "SELECT * FROM clients WHERE phone = ?";

    @Override
    public void save(Client client) {
        if (client == null) {
            System.out.println("Client is empty");
            return;
        }
        ClientDao clientDao = new ClientDaoImpl();
        clientDao.save(client);
    }

    @Override
    public void update(Client client) {
        if (client == null) {
            System.out.println("Client is empty");
            return;
        }
        ClientDao clientDao = new ClientDaoImpl();
        clientDao.update(client);
    }

    @Override
    public Client getById(int id) {
        ClientDao clientDao = new ClientDaoImpl();
        return clientDao.getById(id);
    }

    @Override
    public void delete(Client client) {
        if (client == null) {
            System.out.println("Client is empty");
            return;
        }
        ClientDao clientDao = new ClientDaoImpl();
        clientDao.delete(client);
    }

    public List<Client> phoneSearch(long phone) {
        List<Client> clients = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(PHONE_SEARCH)) {
            preparedStatement.setLong(1, phone);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Client client = new Client();
                client.setName(resultSet.getString("name"));
                client.setEmail(resultSet.getString("email"));
                client.setAbout(resultSet.getString("about"));
                clients.add(client);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }
}
