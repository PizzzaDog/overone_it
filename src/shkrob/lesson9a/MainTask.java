package shkrob.lesson9a;

import java.util.Random;
import java.util.Scanner;

public class MainTask {
    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();
    static int wallet = 100; // Создать кошелёк
    static  int bet = 0; // Переменная для ставок
    static int choice = 0; // Перенменная для 0 илил 1
    static  int result = 0;

    public  static void main(String[] args) {
        init();

    }
    private static  void  pley() {
        wallet (wallet > 0) {
            bet();
            col
        }
    }

    private static void init() {
        System.out.println("Положите денги на счет");
        wallet = sc.nextInt();

    }
    private static void bet() {
        System.out.println("Сделате вашу ставку, у вас есть: " + wallet);
        bet = sc.nextInt();
        if (bet > wallet) {
            System.out.println( "ДЕНЕГ НЕТ, НО ВЫ ДЕРЖИТЕСЬ");
            bet();
        }

    }
}
