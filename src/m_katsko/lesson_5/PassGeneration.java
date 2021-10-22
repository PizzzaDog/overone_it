package m_katsko.lesson_5;

import javax.swing.plaf.TableHeaderUI;
import java.util.Random;
import java.util.Scanner;
/*
\r-удалет строку
\ r-возврвщвет курсор в начало строки. если после нее что-то находиться заменяет сстроку перед \r
 */

public class PassGeneration {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String systempassword = " ";
        String password;
        int temp = 0;

        System.out.println("Придумайте себе пароль");

        for (int k = 0; k < 4; k++) {
            for (int i = 0; i < 11; i++) {
                temp = r.nextInt(10);
                System.out.println(temp);
                Thread.sleep(200);
                System.out.println("\b");
            }

            System.out.println(temp);
            systempassword += temp;
        }

        System.out.println("\r Ваш пароль" + systempassword);
        System.out.println("Ваш пароль исчезнет тчерез");
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(20);
            System.out.print("\b");
        }
        System.out.print("\r ");
        password = sc.nextLine();
    }
}
