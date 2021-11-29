package o_glazdunova.lesson5;

import java.util.Random;
import java.util.Scanner;

public class RedAndBlack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int wallet = 100; // Создаем кошелек
        int bet = 0; // переменная для ставок
        int choice = 0; // Переменная для 0 или 1
        int result = 0;

        while (wallet > 0 && wallet < 200) { // Цикл, который работает, пока кошелек не пуст или не слишком полон
            System.out.println("Ваш баланс: " + wallet);

            System.out.println("Сделайте вашу ставку");
            bet = sc.nextInt(); // Записываем ставку

            if (bet > wallet) { // Проверяем, хватает ли денег
                System.out.println("ДЕНЯГ НЕТ, НО ВЫ ДЕРЖИТЕСЬ");
                break; // Выходим из цикла, если денег нет
            }
            System.out.println("Выберите вашу ставку: 0 или 1.");
            choice = sc.nextInt();
            result = r.nextInt(2); // Рандомим случайное число

            if(choice == result) { // Если мы победили
                wallet += bet;
                System.out.println("Вы победили! Ваш выигрыш составил составил: " + bet * 2);
            } else { // Иначе
                wallet -= bet;
                System.out.println("Ставка не сыграла!");
            }
        }
    }
}

