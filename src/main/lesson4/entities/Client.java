package lesson4.entities;

import java.util.Objects;

public class Client {

    private String clientId;
    private String surname;
    private String accountId;
    private double amount;

    public Client() {
    }

    public Client(String clientId, String surname, String accountId, double amount) {
        this.clientId = clientId;
        this.surname = surname;
        this.accountId = accountId;
        this.amount = amount;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Double.compare(client.amount, amount) == 0 &&
                Objects.equals(clientId, client.clientId) &&
                Objects.equals(surname, client.surname) &&
                Objects.equals(accountId, client.accountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, surname, accountId, amount);
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId='" + clientId + '\'' +
                ", surname='" + surname + '\'' +
                ", accountId='" + accountId + '\'' +
                ", amount=" + amount +
                '}';
    }
}
