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
        Client client1 = new Client(5678, "Jere", 5000, 100, 70);
        Client client2 = new Client(1234, "Salo", 7000, 50, 60);
        Exchange ex = new Exchange();
        ex.authorization(client1);
        ex.authorization(client2);
        if (ex.choice(client1) == ex.choice(client2)) {
            System.out.println("Все прошло успешно,вы можете учавствовать в торгах на бирже " + client1.getName() + " и " + client2.getName());
                ex.moneyToTrade(client1);
                ex.moneyToTrade(client2);
                ex.rubiesAndBrilliantsToTrade(client1,10,10);
                ex.rubiesAndBrilliantsToTrade(client2,10,15);
            }
            else
                System.out.println("Тип не повезло, потом сторгуетесь");
        }
    }

