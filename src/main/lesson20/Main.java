package lesson20;

import lesson20.entities.Client;
import lesson20.services.ClientServiceImpl;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Alla","alla@mail.ru",380509875644L,"boss");
        ClientServiceImpl service = new ClientServiceImpl();
        service.save(client);
    }
}
