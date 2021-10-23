package baranov.lesson_3;

import java.util.Scanner;
import java.util.Random;

public class RedandBlack {

    public static void main(String[] Args) {
        int wallet = 100;

        Scanner scan = new Scanner(System.in);
        int bet = 0;
        int choice = 0;

        Random r = new Random();
        int result = 0;

        while (wallet > 0 && wallet < 200) {
            System.out.println("Сделайте вашу ставку");
            bet = scan.nextInt();

            if (bet > wallet) {
                System.out.println("У вас не достаточно средств");
                break;
            }

            System.out.println("На что ставим (0/1)");
            choice = scan.nextInt();
            result = r.nextInt(2);

            if (choice == result) {
                wallet += bet * 2;
                System.out.println("Вы победили! Ваш баланс равен: ");
                System.out.print(" " + wallet);
                System.out.println();
            } else {
                wallet -= bet;
                System.out.println("Вы проиграли. Ваш баланс равен: ");
                System.out.print(" " + wallet);
                System.out.println();
            }

        }
    }
}