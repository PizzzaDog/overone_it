package baranov.lesson_3;

import java.util.Scanner;
import java.util.Random;
import java.lang.Thread;
import java.lang.String;

public class Password2 {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String systemPassword = "";
        String password = "";

        int temp = 0;
        for(int k = 0; k<4; k++) {
            for (int i = 1; i <= 10; i++) {
                temp = r.nextInt(10);
                System.out.print(temp);
                Thread.sleep(150);
                System.out.print("\b");
            }
           System.out.print(temp);
           systemPassword += temp;

           for(int i = 5; i > 5; i--){
               System.out.print(i);
               Thread.sleep(500);
               System.out.print("\b");
           }
           System.out.print("\r ");
        }

        System.out.println("Придумайте четырехзначный пароль");
        password = sc.nextLine();



    }
}
