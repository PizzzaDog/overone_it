package b_vitaliy.test.task_1;
/*
Выбрать реализацию (интерфейсы/наследование),
написать приложение по продаже и обмену драгоценных камней.
Камни должны иметь стоимость.
Должен быть класс Client (заранее создаются 2 клиента
с разным набором денег и драгоценных камней),
так же класс биржа, на которой тоже есть определенный набор камней.
Пользователь может зайти под логином одного из Client,
и поучаствовать в торгах. Разные камни обмениваются/покупаются/продаются
по разному курсу.
 */

import b_vitaliy.test.task_1.Service.GemsMarket;
import b_vitaliy.test.task_1.gems.Diamonds;
import b_vitaliy.test.task_1.gems.Emiralds;
import b_vitaliy.test.task_1.gems.Rubys;
import b_vitaliy.test.task_1.participants.Client;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Client client1 = new Client("33y3","Nick","red",12000);
        Emiralds emiraldOfClient1 = new Emiralds(800,25);
        Diamonds diamondsOfClient1 = new Diamonds(650,7);

        client1.addGems(emiraldOfClient1);
        client1.addGems(diamondsOfClient1);

        Client client2 = new Client("8811","Mike","green", 8000);
        Rubys rubysOfClient2 = new Rubys(810, 10);
        Diamonds diamondsOfClient2 = new Diamonds(400,8);

        client2.addGems(rubysOfClient2);
        client2.addGems(diamondsOfClient2);

        GemsMarket gemsMarket = new GemsMarket();
        gemsMarket.addClient(client1);
        gemsMarket.addClient(client2);


        System.out.println("clients before bargain:");
        client1.display();
        client2.display();

        gemsMarket.conductBargain();
        System.out.println("\n");

        System.out.println("clients after bargain:");
        client1.display();
        client2.display();

    }
}
