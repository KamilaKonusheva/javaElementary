package lesson17.lesson16.entities;

import javax.persistence.*;

@Entity
@Table (name = "client_status")
public class ClientStatus {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private int id;
    private int clientId;
    private int statusId;
}
