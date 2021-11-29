package o_glazdunova.lesson5;
import java.util.Random;
import java.util.Scanner;


public class PasswordGenerator {
    public static void main(String[] args) throws InterruptedException {
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    StringBuilder systemPassword = new StringBuilder();
    String password;
    int temp = 0;

    for (int k = 0; k < 4; k++) {
        for (int i = 0; i < 10; i++) {
            temp = r.nextInt(10);
            System.out.print(temp);
            Thread.sleep(200);
            System.out.print("\b");
        }

        System.out.print(temp);
        systemPassword.append(temp);
    }

    System.out.print("\rВаш пароль: " + systemPassword + ". Исчезнет через: ");

    for (int i = 5; i > 0; i--) {
        System.out.print(i);
        Thread.sleep(500);
        System.out.print("\b");
    }
    System.out.print("\r ");

    System.out.println("Придумайте себе четырехзначный пароль\r");
    password = sc.nextLine();
}
}






