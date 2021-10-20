package shukan_stanislaw.lesson_3.homework;

import java.util.Random;

public class Task2_stanislaw {
    public static void main(String[] args) {
        int i;
        for (int ars = 0; ars < 20; ars++) {
            Random random = new Random();
            i = random.nextInt(20);
            if (i<=10)
                System.out.println(i);
               else if (i > 10&&i<=14)
                    System.out.println(i + "**");
                    else
                        System.out.println(i+"*");
           }
        }
    }


