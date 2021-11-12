
package a_rogatko.lesson5;
import java.util.Scanner;
import java.util.Random;

import static java.lang.Thread.sleep;

class PasswordGenerator {
    public static void main(String[] args) throws InterruptedException {



int temp = 0;
Random r = new Random();
         String systemPassword ="";
            String password;
            Scanner scanner = new Scanner(System.in);
        System.out.println("Input new password");
            password = scanner.nextLine();
            for(int k = 0; k < 4;k++){
            for(int i = 0; i <10; i++) {
                temp = r.nextInt(10);



                System.out.print(temp);
                Thread.sleep(200);
                System.out.print("\b");
            }
                System.out.print(temp);

            }



    }
}
