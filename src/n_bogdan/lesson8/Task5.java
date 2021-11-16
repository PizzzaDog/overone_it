package n_bogdan.lesson8;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
//        int[] bluda = new int[] {20, 10, 5};
        Scanner sc = new Scanner(System.in);
        int restKril = 20;
        int restNog = 10;
        int restKart = 5;
        Human[] clients = getHumans(5);
        for (Human client : clients) {
            boolean zakazOformlyaetsya = true;
            while (zakazOformlyaetsya) {
                if (restKart + restKril + restNog == 0) break;
                System.out.println("Введите ваш заказ: \nКрылья, осталось: " + restKril);
                client.krylo = sc.nextInt();
                System.out.println("Ножки, осталось: " + restNog);
                client.noga = sc.nextInt();
                System.out.println("Картошка, осталось: " + restKart);
                client.kartoshka = sc.nextInt();
                if (client.krylo > restKril || client.noga > restNog || client.kartoshka > restKart) {
                    System.out.println("У нас столько нет :(");
                    continue;
                }
                zakazOformlyaetsya = false;
                System.out.println("Заказ оформлен, введите ваше имя");
                client.name = sc.next();
                restKril -= client.krylo;
                restNog -= client.noga;
                restKart -= client.kartoshka;
            }


        }
        for (Human h : clients) {
            System.out.println(h.name + "\nКрылья: " + h.krylo + "\nНоги: " + h.noga + "\nКартоха " + h.kartoshka) ;
        }
    }
    private static Human[] getHumans(int count) {
        Human[] people = new Human[count];
        for (int i = 0; i < count; i++) {
            people[i] = new Human();
        }
        return people;
    }
}
