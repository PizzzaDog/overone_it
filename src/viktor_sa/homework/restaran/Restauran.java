package viktor_sa.homework.restaran;

import java.util.Scanner;

import static viktor_sa.homework.restaran.Menu.*;

public class Restauran {
    static Scanner scan = new Scanner(System.in);



    public static void main(String[] args) {
    run();


    }
        public static void run() {
            Client client1 = new Client();
            Client client2 = new Client();
            Client client3 = new Client();
            Client client4 = new Client();
            Client client5 = new Client();

            if (wings + Menu.legs + Menu.legs > 0 && Client.maxClients <= 5) {
                hello(client1);
                order(client1);

                }
            System.out.println("Имя клиента" + client1.getName() + "Количество крылышек: " + client1.getOrderWings() + "Количесвто ножек: " + client1.getOrderLegs() + "Количество картошки: " + client1.getOrderPotatoes());
            }



        public static void hello(Client client) {
            System.out.print("Приветсвуем Вас! Скажите, на какое имя делаем заказ? ");
            client.setName(scan.next());
        }

        public static void order(Client client) {
            System.out.println("Пожалуйста, " + client.getName() +  ", сделайте ваш заказ. Сегодня у нас в меню есть куриные крылышки, ножки и картошка фри.");
            System.out.println("Скажите, сколько вы будете крылышек?");
            client.setOrderWings(scan.nextInt());
            System.out.println("Скажите, сколько вы будете ножек?");
            client.setOrderLegs(scan.nextInt());
            System.out.println("Скажите, сколько вы будете картошки?");
            client.setOrderPotatoes(scan.nextInt());

            if (Client.orderWings <= wings && Client.orderLegs <= legs && Client.orderPotatoes <= potatoes) {
                wings -= client.getOrderWings();
                legs -= client.getOrderLegs();
                potatoes -= client.getOrderPotatoes();
            } else {
                run();
            }

        }

    }
