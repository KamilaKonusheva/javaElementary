package lesson13.services;

import lesson13.entities.Client;
import lesson13.entities.ClientStatus;
import lesson13.entities.Status;
import lesson13.utils.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StatusService {

    private static final String SAVE = "INSERT INTO statuses (alias, description) VALUES (?,?)";
    private static final String UPDATE = "UPDATE statuses SET alias = ?, description = ? WHERE id = ?";
    private static final String GET_ALL = "SELECT * FROM statuses";
    private static final String DELETE = "DELETE * FROM statuses";
    private static final String GET_CLIENTS_WITH_STATUSES_OLDER_THEN_18 = "SELECT c.name, c.email, c.phone, s.alias " +
            "FROM clients c INNER JOIN client_status cs ON c.id = cs.client_id " +
            "INNER JOIN statuses s ON s.id = cs.status_id WHERE client_age > 18";

    public void save(Status status) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SAVE)) {
            preparedStatement.setString(1, status.getAlias());
            preparedStatement.setString(2, status.getDescription());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Status status) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE)) {
            preparedStatement.setString(1, status.getAlias());
            preparedStatement.setString(2, status.getDescription());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Status> getAll() {
        List<Status> statuses = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(GET_ALL);
            while (resultSet.next()) {
                Status status = new Status();
                status.setAlias(resultSet.getString("alias"));
                status.setDescription(resultSet.getString("description"));
                statuses.add(status);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statuses;
    }

    public void delete(Status status) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE)) {
            preparedStatement.setString(1, status.getAlias());
            preparedStatement.setString(2, status.getDescription());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public <FinalList> List<Object> getClientsWithStatuses() {
        List<Status> statuses = new ArrayList<>();
        List<Client> clients = new ArrayList<>();
        List<Object> finalList = new ArrayList<>();
        finalList.addAll(clients);
        finalList.addAll(statuses);
        List<ClientStatus> clientStatuses = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(GET_CLIENTS_WITH_STATUSES_OLDER_THEN_18);
            while (resultSet.next()) {
                Client client1 = new Client();
                Status status1 = new Status();
                client1.setName(resultSet.getString("name"));
                client1.setEmail(resultSet.getString("email"));
                status1.setAlias(resultSet.getString("alias"));
                finalList.addAll(Collections.singleton(client1));
                finalList.addAll(Collections.singleton(status1));
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return finalList;
    }
}
