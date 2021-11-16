package shukan_stanislaw.lesson_14.Task1;

import shukan_stanislaw.lesson_14.Task1.Client.Client;
import shukan_stanislaw.lesson_14.Task1.gems.Brilliants;
import shukan_stanislaw.lesson_14.Task1.gems.Gems;
import shukan_stanislaw.lesson_14.Task1.gems.Rubies;
import shukan_stanislaw.lesson_14.Task1.service.Exchange;

public class Main {
    public static void main(String[] args) {
        Brilliants br = new Brilliants(5000);
        Rubies rub = new Rubies(6000);
        Client client1 = new Client(5678,"Jere",5000,100,70);
        Client client2 = new Client(1234,"Salo",7000,50,60);
        Exchange ex = new Exchange();
         ex.authorization(client1);
         ex.authorization(client2);
        int client1Money = ex.moneyToTrade(client1, client1.getBr(), client1.getRub());
        int client2Money = ex.moneyToTrade(client2,client2.getBr(), client2.getRub());
        ex.choice(client1);
        ex.choice(client2);

    }
}
