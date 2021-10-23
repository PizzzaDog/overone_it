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
        StringBuilder reservPass = new StringBuilder();
        int temp = 0;
        System.out.print("Здравствуйте, придумайте себе 4-х значный пароль: ");
        String mainPass = sc.nextLine();
        System.out.println("Ваш резервный пароль сгенерируется системой.");

        for (int k = 0; k < 4; k++) {

            for (int i = 0; i < 10; i++) {
                temp = rn.nextInt(10);
                System.out.print(temp);
                Thread.sleep(200);
                System.out.print("\b");

            }
            System.out.print(temp);
            reservPass.append(temp);
        }

        System.out.print("\rВаш резервный пароль: " + reservPass + ".. Исчезнет через: ");

        for (int i = 5; i > 0; i--) {
            System.out.print(i);
            Thread.sleep(1000);
            System.out.print("\b");
        }

        System.out.print("\r ");

        System.out.print("Для входа в систему введите пароль: ");
        String inputPass = sc.nextLine();
        if (inputPass.equals(mainPass)) {
            System.out.println("Приветствуем, вы вошли в систему.");
        } else if (inputPass.equals(reservPass.toString())) {
            System.out.println("Приветствуем, вы ввели резервный пароль для входа в систему, пожалуйста, измените ваш основной пароль.");
        } else {
            System.out.println("Вы ввели неверный пароль.");
        }

    }
}
