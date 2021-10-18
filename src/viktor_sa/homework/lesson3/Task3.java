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

        String mainPassword = "1111";
        String reservPassword = "2222";

        System.out.print("Please, enter your password: ");
        String enterPassword = scan.nextLine();

        if (enterPassword.length() != 4) {
            System.out.println("Error");
        }

        switch (enterPassword) {
            case "1111": //mainPassword
                System.out.println("Hello");
                break;

            case "2222": //reservPassword
                System.out.println("Hello, change your password");
                break;

            default:
                System.out.println("Wrong Password");
        }

/**        if (enterPassword.equals(mainPassword)) {
            System.out.println("Hello");
        } else if (enterPassword.equals(reservPassword)) {
            System.out.println("Hello, change your password");
        } else if (enterPassword.length() != 4) {
            System.out.println("Error");
        } else {
            System.out.println("Wrong password");
        }
*/
        scan.close();
    }
}