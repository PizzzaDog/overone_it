package viktor_sa.homework.restaran;

import java.util.Scanner;


public class Restauran {
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        run();


    }

    static Client client1 = new Client();
    static Client client2 = new Client();
    static Client client3 = new Client();
    static Client client4 = new Client();
    static Client client5 = new Client();

    static Client[] clients = new Client[] {client1, client2, client3, client4, client5};

//    static Client[] clientsName = new Client[Client.maxClients];
//    static Client[] clientsOrderWings = new Client[Client.maxClients];
//    static Client[] clientsOrderLegs = new Client[Client.maxClients];
//    static Client[] clientsOrderPotatoes = new Client[Client.maxClients];


    private static void run() {

        while (Menu.wings != 0 || Menu.legs != 0 || Menu.potatoes != 0 || Client.clientQuantity < 6) {
            for(Client a : clients) {
                hello(a);
                order(a);
            }

//            hello(client1);
//            order(client1);
//            Client.clientQuantity ++;



        }
        System.out.println("Имя клиента: " + client1.getName() + " Количество крылышек: " + client1.getOrderWings() + " Количесвто ножек: " + client1.getOrderLegs() + " Количество картошки: " + client1.getOrderPotatoes());
    }


    private static void hello(Client client) {
        System.out.print("Приветсвуем Вас! Скажите, на какое имя делаем заказ? ");
        client.setName(scan.next());
    }

    private static void order(Client client) {
        System.out.println("Пожалуйста, " + client.getName() + ", сделайте ваш заказ. Сегодня у нас в меню есть куриные крылышки, ножки и картошка фри.");
        System.out.println("Скажите, сколько вы будете крылышек?");
        client.setOrderWings(scan.nextInt());
        System.out.println("Скажите, сколько вы будете ножек?");
        client.setOrderLegs(scan.nextInt());
        System.out.println("Скажите, сколько вы будете картошки?");
        client.setOrderPotatoes(scan.nextInt());

        if (Client.orderWings <= Menu.wings && Client.orderLegs <= Menu.legs && Client.orderPotatoes <= Menu.potatoes) {
            Menu.wings -= client.getOrderWings();
            Menu.legs -= client.getOrderLegs();
            Menu.potatoes -= client.getOrderPotatoes();

//        } else if (Menu.wings = 0 || Menu.legs = 0 || Menu.potatoes = 0) {
//            System.out.println("К сожалению, у нас закончились некоторые позиции в меню, пожалуйста, сделайте заказ заново, учитывая эту информацию.");
//            System.out.println("У нас осталось: крылышек - " + Menu.wings + " , ножек - " + Menu.legs + " , картошки - " + Menu.potatoes);
//            run();
//        } else if (Client.clientQuantity == 6) {
//
     }

    }

}
