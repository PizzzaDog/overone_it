package viktor_sa.lesson6;

import java.util.Random;
import java.util.Scanner;

public class RedAndBlack {
    public static void main(String[] args) {
        int wallet = 100; // Создаем кошелек
        Scanner sc = new Scanner(System.in);
        int bet = 0; // Переменнная для ставок
        int choice = 0;
        int result;
        Random rn = new Random();

        while (wallet > 0 && wallet < 200) { // Цикл работает пока кошелек не пуст или не перевышает 200
            System.out.println("Ваш баланс составляет: " + wallet);
            System.out.println("Сделайте вашу ставку: ");
            bet = sc.nextInt(); // Записываем ставку

            if (bet > wallet) { // Проверяем что хватает денег
                break; // Выходим из цикла
            }

            System.out.println("Выберете вашу ставку: 0 или 1?");
            choice = sc.nextInt();
            result = rn.nextInt(2);

            if (choice == result) {
                wallet += bet;
                System.out.println("Вы победили! Ваш выйгрыш соствил: " + bet * 2);
            } else {
                wallet -= bet;
                System.out.println("Ставка не сыграла!");
            }
        }
    }
}
