package shkrob.lesson10;

import java.util.Scanner;

public class Rest2 {
    public static void main(String[] args);
    Scanner sc = new Scanner(System.in);
    Guest guest1 = new Guest();
    Guest guest2 = new Guest();
    Guest guest3 = new Guest();
    Guest guest4= new Guest();

    Guest[] guests = new Guest[]{guest1, guest2, guest3, guest4};

    for (Guest a: guests) {
        hello(a);
        a = new Guest('qweqwe');
    }
    for (Guest a: guests) {
        System.out.println(a);
    }
    private static void hello(Guest guest) {
        System.out.println("Задай имя");
        guest1.setName(sc.next());
    }
    System.out.println("Задай имя");
    guest1.setName(sc.next());
}

