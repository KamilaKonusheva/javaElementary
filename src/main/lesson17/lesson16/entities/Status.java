package lesson17.lesson16.entities;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "statuses")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String alias;
    private String description;

    @ManyToMany
    @JoinTable (name = "client_status",
            joinColumns = @JoinColumn(name = "status_id"),
            inverseJoinColumns = @JoinColumn (name = "client_id"))
    private Set<Client> clients; // такой вариант взяла из доп.материалов в Slack

    // @ManyToMany (mappedBy =  "statuses")
    //private Set <Client> clients;

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
