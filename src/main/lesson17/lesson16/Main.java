package lesson17.lesson16;

import lesson17.lesson16.entities.Client;
import lesson17.lesson16.services.ClientServiceImpl;

public class Main {
    public static void main(String[] args) {

        Client client = new Client("Adam","adam@mail.ru",380987564556L,"manager");
        ClientServiceImpl clientService = new ClientServiceImpl();
        clientService.save(client);
    }
}
