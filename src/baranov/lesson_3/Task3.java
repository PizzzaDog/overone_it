package baranov.lesson_3;

import java.util.Scanner;

import java.lang.String;

public class Task3 {

    public static void main(String[] args) {

        int pass1, pass2, pass3;
        Scanner scan = new Scanner(System.in);

        System.out.println("введите основной пароль");
        pass1 = scan.nextInt();

        System.out.println("введите запасной пароль");
        pass2 = scan.nextInt();

        System.out.println("авторизуйтесь");
        pass3 = scan.nextInt();

        if ((pass3 >= 1000) && (pass3 <= 9999)) {

            if (pass3 == pass1) System.out.println("Hello");
            else if (pass3 == pass2) System.out.println("Hello, change your password");
            else System.out.println("Wrong password");
        } else System.out.println("Error");

    }

}
