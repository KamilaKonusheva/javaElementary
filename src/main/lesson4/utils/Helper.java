package lesson4.utils;

import lesson4.entities.Client;
import lesson4.exceptions.UserExpectedError;
import lesson4.exceptions.WrongFieldException;
import lesson4.exceptions.WrongSumException;

import java.util.Objects;

public class Helper {
    private Client client;

    public void lengthCheck(String accountId) throws WrongFieldException {
        if (accountId.length() != 10) {
            throw new WrongFieldException();
        }
    }

    public void amountCheck(double amount) throws WrongSumException {
        if (amount > 1000) {
            throw new WrongSumException();
        }
    }


    public void idCheck(String senderId, String recipientId) {
        if (!senderId.equals(recipientId)) {
            throw new UserExpectedError();
        }
    }

    public Helper() {
    }

    public Helper(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Helper helper = (Helper) o;
        return Objects.equals(client, helper.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(client);
    }

    @Override
    public String toString() {
        return "Helper{" +
                "client=" + client +
                '}';
    }
}
