package b_vitaliy.lesson_not10.rest;

import java.util.Scanner;

public class Rest {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Guest guest1 = new Guest(10, "Andrew");
        Guest guest2 = new Guest("qwe", 1);
        Guest guest4 = new Guest();
        Guest guest3 = new Guest("Mike");

        Guest[] guests = new Guest[] {guest1, guest2, guest3, guest4};

        for(Guest a: guests){
           hello(a);
        }

        for(Guest a: guests){
            System.out.println(a.getName());
        }


    }

    private static void hello(Guest guest){
        System.out.println("Задайте имя");
        guest.setName(sc.next());
    }
}
