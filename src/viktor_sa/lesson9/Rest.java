package viktor_sa.lesson9;

import java.util.Scanner;

public class Rest {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Guest guest1 = new Guest();
        Guest guest2 = new Guest();
        Guest guest3 = new Guest();
        Guest guest4 = new Guest();

        Guest[] guests = new Guest[] {guest1, guest2, guest3, guest4};

        for (Guest a : guests) {
            hello(a);
        }
    }

    private static void hello(Guest guest) {
        System.out.println("Задайте имя");
        guest.setName(sc.next());
    }
}
