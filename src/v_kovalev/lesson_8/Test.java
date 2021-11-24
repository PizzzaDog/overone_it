package v_kovalev.lesson_8;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
        task_4();
    }

    public static void task_1() {
        String[] array = new String[]{"а", "е", "ё", "и", "о", "у", "ы", "э", "ю", "я"};
        for (String letter : array) {
            System.out.print(letter + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i = i + 2) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void task_2() {
        int x = 2;
        for (int i = 0; i < 5; i++) {
            x = (x * x) - 1;
            System.out.println(x);
        }

    }

    public static void task_3() {
        int[] array = new int[]{15, 18, 253, 762, 12, 333, 59, 78, 92, 25, 78, 25, 26, 27, 28};
        int res = 0;

        for (int number : array) {
            if (number % 2 == 0) {
                while (number != 0) {
                    res += (number % 10);
                    number = number / 10;
                }
                System.out.print(res + ",");
            }
            res = 0;
        }
        System.out.print("\b.");
    }

    // 0 1 1 2 3 5
    // 1 = 0 + 1
    // 2 = 1 + 1
    // 3 = 1 + 2
    // 5 = 2 + 3
    public static void task_4() {
        System.out.println();
        int number = 0;
        int number1 = 1;
        int number2 = 1;
        System.out.print(number + " " + number1 + " " + number2 + " ");
        while (number < 1000){
             number = number1 + number2;
             if (number < 1000) {
                 System.out.print(number + " ");
             }
            number1 = number2;
            number2 = number;
        }
    }

}
