package lesson17.lesson16.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table (name = "passports")
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String number;
    private String series;

    @OneToOne (mappedBy = "passport")
    private Client client;

    public Passport() {
    }

    public Passport(String number, String series, Client client) {
        this.number = number;
        this.series = series;
        this.client = client;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
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
        Passport passport = (Passport) o;
        return id == passport.id &&
                Objects.equals(number, passport.number) &&
                Objects.equals(series, passport.series) &&
                Objects.equals(client, passport.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, series, client);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", series='" + series + '\'' +
                ", client=" + client +
                '}';
    }
}
