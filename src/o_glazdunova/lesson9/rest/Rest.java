package o_glazdunova.lesson9.rest;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Rest {

    static Scanner sc = new Scanner(System.in);//создаем сканер

    public static void main(String[] args) {
        //создам гостей, решим с помощью цикла
        Guest guest1 = new Guest();
        Guest guest2 = new Guest();
        Guest guest3 = new Guest();
        Guest guest4 = new Guest();

        //        hello(guest1);
//        System.out.println(guest1.getName());

//        Долго, но можно.  создание сканера для вывода текста в консоль
//        String name = sc.next();
//        guest1.setName(name);

// ПЛАН ЗБС, НО НЕ НАДО ТАК Выводим каждого гостя отдельно,если одно и то же повторяется лучше его сделать методом или массивом или циклом
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

        Guest[] guests = new Guest[]{guest1, guest2, guest3, guest4};//создаем саммив

        for (Guest a : guests) { //каждый из гостей = а, пробегаемся по каждому гостю из массива и выводятся ссылки, так не надо делать
            //Передаем копию ссылки
            hello(a);

            //FOREACH работает с копиями ссылок, поэтому бесполезно делать:
            a = new Guest("qweqwe");
        }


        for (Guest a : guests) {// так правильно,задаем гостям а значения на нашу коробку гостей,а не ссылку.
            System.out.println(a.getName());;
        }

    }


    private static void hello(Guest guest) {
        System.out.println("Задайте имя");
        guest.setName(sc.next());
    }

    //Нет необходимости, т.к. в методы передаются ссылки на объекты, а не сами объекты
    @Contract("_ -> param1")
    public static @NotNull Guest hello2(@NotNull Guest guest) {
        System.out.println("Задайте имя");
        guest.setName(sc.next());
        return guest;
    }
}




