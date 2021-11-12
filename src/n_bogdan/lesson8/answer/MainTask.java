package n_bogdan.lesson8.answer;

import java.util.Random;
import java.util.Scanner;

public class MainTask {
    static int wallet = 0; // Создаем кошелек
    static int bet = 0; // переменная для ставок
    static int choice = 0; // Переменная для 0 или 1
    static int result = 0;
    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();

    public static void main(String[] args) {
        GameCase game = new GameCase();

//        init();
//        play();
    }

//    public static void game(GameCase game) {
////        init(game);
//        play(game);
//    }
//
//    private static void play(GameCase game) {
//        while (game.wallet > 0) {
//            bet();
//            colorBet();
//            total();
//        }
//    }
//
//    private static void init() {
//        System.out.println("Положите деньги на счет ");
//        wallet = sc.nextInt();
//    }
//
//    private static void bet() {
//        System.out.println("Сделайте вашу ставку, у вас есть: " + wallet);
//        bet = sc.nextInt();
//        if (bet > wallet) {
//            System.out.println("ДЕНЯГ НЕТ, НО ВЫ ДЕРЖИТЕСЬ");
//            bet();
//        }
//    }
//
//    private static void colorBet() {
//        System.out.println("Выберите 1 или 2:");
//        choice = sc.nextInt();
//        result = r.nextInt(2);
//    }
//
//    private static void total() {
//        if (choice == result) {
//            System.out.println("Вы победили!");
//            wallet += bet;
//        } else {
//            System.out.println("Вы проиграли!");
//            wallet -= bet;
//        }
//    }
//
//    /**
//     * не надо так (как и всё в это классе)
//     */
//    private static void writeToConsole(String string) {
//        System.out.println(string);
//    }
}
