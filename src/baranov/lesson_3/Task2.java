package baranov.lesson_3;

import java.util.Random;

public class Task2 {

    public static void main(String[] args) {

        Random random = new Random();
        int a;

        for (int i = 1; i <= 20; i++) {
            a = random.nextInt(21);

            if (a <= 10) System.out.println(a);
            else if (a <= 14) System.out.println(a + "**");
            else System.out.println(a + "*");
        }

    }

}
