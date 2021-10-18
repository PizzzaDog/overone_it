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

        String incorrectPassword = enterPassword.length() != 4 ? "Wrong" : "Wrong!";

        switch (enterPassword) {
            case "1111":
                System.out.println("Hello");
                break;

            case  "2222":
                System.out.println("Hello, change your password");
                break;

            case incorrectPassword:
                System.out.println("Error");
                break;

            default:
                System.out.println("Wrong Password");
        }

        /**       if (enterPassword == mainPassword) {
         System.out.println("Hello");
         } else if (enterPassword == reservPassword) {
         System.out.println("Hello, change your password");
         } else if (enterPassword != mainPassword || enterPassword != reservPassword) {
         System.out.println("Wrong Password");
         } else {
         System.out.println("Error");
         }
         */
        scan.close();
    }
}