package lesson20.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "statuses")
public class Status {

    @Id
    private int id;
    private String alias;
    private String description;

    public Status() {
    }

    public Status(String alias, String description) {
        this.alias = alias;
        this.description = description;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Status status = (Status) o;
        return id == status.id &&
                Objects.equals(alias, status.alias) &&
                Objects.equals(description, status.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, alias, description);
    }

    @Override
    public String toString() {
        return "Status{" +
                "id=" + id +
                ", alias='" + alias + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
