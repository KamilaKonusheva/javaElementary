package lesson4.services;

import lesson4.entities.Client;
import lesson4.utils.Helper;

public class TransactionService {
    public void moneySender(Client client, String accountId) {
        Helper helper = new Helper();
        helper.idCheck(client.getAccountId(), accountId);
    }
}
