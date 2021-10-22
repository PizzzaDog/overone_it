package m_katsko.lesson_5;

import java.util.Random;
import java.util.Scanner;

public class Red_Blak {
    public static void main(String[] args) {
        int wallet = 100;//кошелек
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int det = 0;//ставка
        int choise = 0;
        int resault = 0;

        while (wallet > 0 && wallet < 200) {
            System.out.println("баланс " + wallet);
            System.out.println("Сделайте вашу ставку");
            det = sc.nextInt();//запись сставки
            if (det > wallet) { //проверка денег
                System.out.println("денег нет");
                break;
            }
            System.out.println("Выберите вашу ставку 0 или 1");
            choise = sc.nextInt();
            resault = r.nextInt(2);
            System.out.println(resault);

            if (choise == resault) {
                wallet += det;
                System.out.println("Вы выыйграли! ва выйгрыш составил:" + 2 * det);
            } else {
                wallet -= det;
                System.out.println("Вы проиграли! ва проигрыш составил:" + det);
            }

        }


    }
}
