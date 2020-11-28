package lesson13.entities;

import java.util.Objects;

public class ClientStatus {
    private int id;
    private int clientId;
    private int statusId;

    public ClientStatus() {
    }

    public ClientStatus(int clientId, int statusId) {
        this.clientId = clientId;
        this.statusId = statusId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientStatus that = (ClientStatus) o;
        return id == that.id &&
                clientId == that.clientId &&
                statusId == that.statusId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clientId, statusId);
    }

    @Override
    public String toString() {
        return "ClientStatus{" +
                "id=" + id +
                ", clientId=" + clientId +
                ", statusId=" + statusId +
                '}';
    }
}
