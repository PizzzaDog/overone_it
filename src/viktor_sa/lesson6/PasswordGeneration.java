package viktor_sa.lesson6;

import java.util.Random;
import java.util.Scanner;

/**
 * Спецсимволы у String
 * \b - удаление одного символа
 * \t - табуляция
 * \r - возвращение курсора в начало строки (если идет еще хотя бы 1 символ после \r, то вся строка затрется
 * \n - перевод на новую строку
 */

public class PasswordGeneration {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        String systemPass = "";
        String password;
        int temp = 0;

 //       System.out.print("Здравствуйте, придумайте себе 4-х значный пароль:");
//        password = sc.nextLine();

        for (int k = 0; k < 4; k++) {

            for (int i = 0; i < 10; i++) {
                temp = rn.nextInt(10);
                System.out.print(temp);
                Thread.sleep(200);
                System.out.print("\b");

            }
            System.out.print(temp);
            systemPass += temp;
        }

        System.out.println("\rВаш пароль: " + systemPass + ".. Исчезнет через: ");

        for (int i = 5; i > 0; i--) {
            System.out.print(i);
            Thread.sleep(500);
            System.out.print("\b");
        }

        System.out.print("\r ");


     //   System.out.println("Ваш системный пароль: " + systemPass);
    }
}
