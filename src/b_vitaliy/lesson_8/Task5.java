package b_vitaliy.lesson_8;

import java.util.Scanner;

/*
Если нагуглили 4, написать ресторан KFC:
Старт: в начале есть 20 крылышек, 10 ножек и 5 картошек.
Приходит клиент и делает заказ, вводя количество каждой позиции. Клиент указывает свое имя и заказ сохраняется.
Максимум 5 клиентов. Если какая-то из позиций закончилась, а клиент ее выбрал, он должен сделать выбор заново.
Если ничего не осталось, или 5 клиентов обслужены, выводятся результаты дня в формате:
*Имя клиента*: Крылышки - *количество*, ножки - *количество*, картошки - *количество*
 */
public class Task5 {
    public static void main(String[] args) {
        Integer wings = 20, legs = 10, potatoes = 5;
        Integer answer = 0;
        Scanner scan = new Scanner(System.in);

        Client[] zakaz = new Client[5];
        for (int i = 0; i < 5; i++) {
            zakaz[i] = new Client();
        }

        int clients = 0;


        while (clients < 5) {
            if (wings == 0 && legs == 0 && potatoes == 0) {
                System.out.println("KFC закрыт, закончились продукты");
                break;
            }

            System.out.println("Будете делать заказ?\n1)да \n2)нет");
            answer = scan.nextInt();
            if (answer == 1) {
                System.out.println("У нас осталось :" + wings + " - крылышек, " + legs + " - ножек," + potatoes + " - картошек.");
                System.out.println("Введите имя");
                zakaz[clients].name = scan.nextLine();
                zakaz[clients].name = scan.nextLine();
                System.out.println("введите кол-во крылышек");
                zakaz[clients].wings = scan.nextInt();
                System.out.println("введите кол-во ножек");
                zakaz[clients].legs = scan.nextInt();
                System.out.println("введите кол-во картошек");
                zakaz[clients].potatoes = scan.nextInt();

                if ((zakaz[clients].wings <= wings) && (zakaz[clients].legs <= legs) && (zakaz[clients].potatoes <= potatoes)) {
                    wings -= zakaz[clients].wings;
                    legs -= zakaz[clients].legs;
                    potatoes -= zakaz[clients].potatoes;
                    clients++;

                } else {
                    System.out.println("Переделайте заказ, у нас не хватает продуктов");
                }

            } else break;
        }

        for (int i = 0; i < clients; i++) {
            System.out.println(zakaz[i].name + ":  Крылышки - " + zakaz[i].wings + " ножки - " + zakaz[i].legs + " картошки - " + zakaz[i].potatoes);
        }

    }
}
