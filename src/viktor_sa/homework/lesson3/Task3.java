package viktor_sa.homework.lesson3;

/* Создать 2 пароля: основной и запасной.

 * Ввести с клавиатуры 4 значный пароль (из цифр)
 * Если пароль верный, написать "Hello"
 * Если ввели верный запасной пароль, написать "Hello, change your password"
 * Если неверный, написать "Wrong Password"
 * Если пароль не из 4 цифр, написать ("Error");

 */

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final String mainPassword = "1111";
        final String reservPassword = "2222";

        System.out.print("Please, enter your password: ");
        String enterPassword = scan.nextLine();

        if (enterPassword.length() != 4) {
            System.out.println("Error");
        } else {

            switch (enterPassword) {
                case mainPassword:
                    System.out.println("Hello");
                    break;

                case reservPassword:
                    System.out.println("Hello, change your password");
                    break;

                default:
                    System.out.println("Wrong Password");
            }
        }
    }
}