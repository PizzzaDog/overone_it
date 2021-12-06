package viktor_sa.homework.restaran;
import java.util.Scanner;

public class Restauran {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    static Client client1 = new Client();
    static Client client2 = new Client();
    static Client client3 = new Client();
    static Client client4 = new Client();
    static Client client5 = new Client();

    private static void run() {

        Client[] clientsArray = new Client[] {client1, client2, client3, client4, client5};


        while (Menu.wings != 0 || Menu.legs != 0 || Menu.potatoes != 0) {
            for (int i = 0; i < clientsArray.length; i++) {
                hello(clientsArray[i]);
                order(clientsArray[i]);

            }
        }
//        System.out.println("Имя клиента: " + client.getName() + " Количество крылышек: " + client.getOrderWings() + " Количесвто ножек: " + client.getOrderLegs() + " Количество картошки: " + client.getOrderPotatoes());

    }


    private static void hello(Client client) {
        System.out.println("Приветсвуем Вас! Скажите, на какое имя делаем заказ? ");
        client.setName(scanner.nextLine());
    }

    private static void order(Client client) {
        System.out.println("Пожалуйста, " + client.getName() + ", сделайте ваш заказ. Сегодня у нас в меню есть куриные крылышки, ножки и картошка фри.");
        System.out.println("Скажите, сколько вы будете крылышек?");
        client.setOrderWings(scanner.nextInt());
        System.out.println("Скажите, сколько вы будете ножек?");
        client.setOrderLegs(scanner.nextInt());
        System.out.println("Скажите, сколько вы будете картошки?");
        client.setOrderPotatoes(scanner.nextInt());

        if (Client.orderWings <= Menu.wings && Client.orderLegs <= Menu.legs && Client.orderPotatoes <= Menu.potatoes) {
            Menu.wings -= client.getOrderWings();
            Menu.legs -= client.getOrderLegs();
            Menu.potatoes -= client.getOrderPotatoes();
        } else {
            System.out.println("К сожалению, у нас закончились некоторые позиции в меню, пожалуйста, сделайте ваш заказ снова. \n");
            run();
        }

    }

//    private static void chek(Client client) {
//
//    }

}
