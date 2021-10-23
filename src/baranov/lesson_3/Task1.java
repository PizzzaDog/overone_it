package baranov.lesson_3;

import java.util.Random;

public class Task1 {

    public static void main(String[] args) {

        Random random = new Random();
        Integer a = 0;
        for (int i = 1; i <= 20; i++) {

            a = random.nextInt(21);

            if (a <= 10) System.out.println(a);
            else System.out.println(a + "*");

        }

    }

}