package o_glazdunova.ds1;

import java.util.Scanner;


public class task2 {
    private static Scanner Scan;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mainPassword = "4444";
        String ReservPassword = "5555";
        System.out.println("Your Password");
        String enterPassword = Scan.nextLine();
        if (enterPassword.length() != 4); {
            System.out.println("Error");
        }
        switch (enterPassword) {
            case  "4444":
                System.out.println("Hello");
                break;
            case "5555":
                System.out.println("Hello, change your password");
                break;
            default:
                System.out.println("Wrong Password");
        }

    }
}
