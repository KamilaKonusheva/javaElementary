package lesson16.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    private int id;
    private int clientId;
    private String number;
    private double value;

    public Account() {
    }

    public Account(int clientId, String number, double value) {
        this.clientId = clientId;
        this.number = number;
        this.value = value;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id &&
                clientId == account.clientId &&
                Double.compare(account.value, value) == 0 &&
                Objects.equals(number, account.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clientId, number, value);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", clientId=" + clientId +
                ", number='" + number + '\'' +
                ", value=" + value +
                '}';
    }
}
