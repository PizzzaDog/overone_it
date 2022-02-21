package shukan_stanislaw.lesson_10.rest;

import java.util.Scanner;

public class Rest {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Guest guest1 = new Guest();
        Guest guest2 = new Guest();
        Guest guest3 = new Guest();
        Guest guest4 = new Guest();


//        hello(guest1);
//        System.out.println(guest1.getName());

//        Долго, но можно
//        String name = sc.next();
//        guest1.setName(name);

// ПЛАН ЗБС, НО НЕ НАДО ТАК
//        System.out.println("Задайте имя");
//        guest1.setName(sc.next());
//
//        System.out.println("Задайте имя");
//        guest2.setName(sc.next());
//
//        System.out.println("Задайте имя");
//        guest3.setName(sc.next());


        //УЖЕ ЛУЧШЕ, НО НЕ НАДО ТАК
//        hello(guest1);
//        hello(guest2);
//        hello(guest3);

        Guest[] likeGuests = new Guest[4];

        Guest[] guests = new Guest[]{guest1, guest2, guest3, guest4};

        for (Guest a : guests) {
            //Передаем копию ссылки
            hello(a);

            //FOREACH работает с копиями ссылок, поэтому бесполезно делать:
            a = new Guest("qweqwe");
        }


        for (Guest a : guests) {
            System.out.println(a.getName());;
        }

    }


    private static void hello(Guest guest) {
        System.out.println("Задайте имя");
        guest.setName(sc.next());
    }

    //Нет необходимости, т.к. в методы передаются ссылки на объекты, а не сами объекты
    public static Guest hello2(Guest guest) {
        System.out.println("Задайте имя");
        guest.setName(sc.next());
        return guest;
    }
}
