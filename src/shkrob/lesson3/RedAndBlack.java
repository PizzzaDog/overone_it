package shkrob.lesson3;

import java.util.Scanner;

public class RedAndBlack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wallet = 100; //  Содаем кошелек
        int bet = 0; // переменая для ставки

        while (wallet > 0 && wallet < 200) { // цикл, который работает, пока кошелек не пуст или не слишком полн
            System.out.println("сделайте вашу ставку");
            bet = sc.nextInt(); // Записываем ставку

            if (bet > wallet) { // Проверяем, хватает ли денег
                System.out.println("ДЕНЕГ НЕТ, НО ВЫ ДЕРЖИТЕСЬ");
                break; // Выхом из цикла, если денег нет
            }
            //System.out.println('Выберите вашу ставку: 0 или 1.');
            //choice = sc.nextInt();
        }
    }
}

