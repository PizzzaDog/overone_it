//package baranov.lesson_9;
//
//import java.util.Random;
//import java.util.Scanner;
//
//
//public class task1 {
//    static Scanner sc = new Scanner(System.in);
//    static Random r = new Random();
//
//    public static void main(String[] Args) {
//        GameCase game = new GameCase();
//
//        init();
//        play();
//    }
//
//    public static void game() {
//
//    }
//
//    private static void init() {
//        System.out.println("Положите денег на счет");
//        wallet = sc.nextInt();
//    }
//
//    private static void bet() {
//        System.out.println("Сделайте ставку, у вас на балансе " + wallet);
//        bet = sc.nextInt();
//        if (bet > wallet) {
//            System.out.println("У вас не достаточно средств");
//            bet();
//        }
//    }
//
//    private static void choice() {
//        System.out.println("Выберите 1 или 2");
//        choice = sc.nextInt();
//
//        result = r.nextInt(2);
//
//    }
//
//    private static void total() {
//        if (choice == result) {
//            System.out.println("вы победили");
//            wallet += bet;
//        } else {
//            System.out.println("вы проиграли");
//            wallet -= bet;
//        }
//    }
//
//    private static void play() {
//        while (wallet > 0) {
//            bet();
//            choice();
//            total();
//        }
//    }
//}

