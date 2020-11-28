package lesson13.services;

import lesson13.entities.Account;
import lesson13.utils.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountService {

    private static final String SAVE = "INSERT INTO accounts (client_id, number, value) VALUES (?,?,?)";
    private static final String UPDATE = "UPDATE accounts SET client_id = ?, number = ?, value = ? WHERE id = ?";
    private static final String GET_ALL = "SELECT * FROM accounts";
    private static final String DELETE = "DELETE * FROM accounts";
    private static final String GET_ACCOUNT_NUMBER = "SELECT number FROM accounts WHERE value > 1000.0";
    //взяла тот запрос, что был у нас в предыдущем ДЗ... С передаваемым параметром не получилось...

    public void save(Account account) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SAVE)) {
            preparedStatement.setInt(1, account.getClientId());
            preparedStatement.setString(2, account.getNumber());
            preparedStatement.setDouble(3, account.getValue());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Account account) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE)) {
            preparedStatement.setInt(1, account.getClientId());
            preparedStatement.setString(2, account.getNumber());
            preparedStatement.setDouble(3, account.getValue());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Account> getAll() {
        List<Account> accounts = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(GET_ALL);
            while (resultSet.next()) {
                Account account = new Account();
                account.setClientId(resultSet.getInt("clientId"));
                account.setNumber(resultSet.getString("number"));
                account.setValue(resultSet.getDouble("value"));
                accounts.add(account);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accounts;
    }

    public void delete(Account account) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE)) {
            preparedStatement.setInt(1, account.getClientId());
            preparedStatement.setString(2, account.getNumber());
            preparedStatement.setDouble(3, account.getValue());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Account> getAccountNumber() {
        List<Account> accounts = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(GET_ACCOUNT_NUMBER);
            while (resultSet.next()) {
                Account account = new Account();
                account.setNumber(resultSet.getString("number"));
                accounts.add(account);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accounts;
    }
}
