package lesson17.lesson16.entities;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private String email;
    private long phone;
    private String about;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "passport_id")
    private Passport passport;

    @OneToMany (mappedBy = "client", fetch=FetchType.EAGER)
    private Set <Account> accounts;

    @ManyToMany
    @JoinTable (name = "client_status",
    joinColumns = @JoinColumn(name = "client_id"),
    inverseJoinColumns = @JoinColumn (name = "status_id"))
    private Set <Status> statuses;


    public Client() {
    }

    public Client(String name, String email, long phone, String about) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.about = about;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id &&
                phone == client.phone &&
                Objects.equals(name, client.name) &&
                Objects.equals(email, client.email) &&
                Objects.equals(about, client.about);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, phone, about);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", about='" + about + '\'' +
                '}';
    }
}
