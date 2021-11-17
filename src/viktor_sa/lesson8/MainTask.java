package viktor_sa.lesson8;

import java.util.Random;
import java.util.Scanner;

public class MainTask {

    static  Scanner sc = new Scanner(System.in);
    static Random rn = new Random();
    static int wallet = 100; // Создаем кошелек
    static int bet = 0; // Переменнная для ставок
    static int choice = 0;
    static int result;

    public static void main(String[] args) {

        init();
        play();
    }

    private static void play() {
        while (wallet > 0) {
            bet();
            colorBet();
            total();
        }
    }

    private static void init() {
        System.out.println("Сделайте вашу ставку");
        wallet = sc.nextInt();
    }



    private static void bet() {
        System.out.println("Ваш баланс составляет: " + wallet);
        bet = sc.nextInt();
        if (bet > wallet) {
            System.out.println("Сделайте вашу ставку: ");
            bet();
        }
    }

    private static void colorBet() {
        System.out.println("Выберете вашу ставку: 0 или 1?");
        choice = sc.nextInt();
        result = rn.nextInt(2);
    }

    private static void total() {
        if (choice == result) {
            wallet += bet;
            System.out.println("Вы победили! Ваш выйгрыш соствил: " + bet * 2);
        } else {
            wallet -= bet;
            System.out.println("Ставка не сыграла!");
        }
    }

}
