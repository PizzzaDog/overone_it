package baranov.lesson_3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int answer, k = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("вводите номер ответа на вопрос ");

        System.out.println("вопрос 1");
        System.out.println("Какой это вопрос");
        System.out.println("(1) (2) (3) (4)");
        answer = scan.nextInt();

        if (answer == 1) k++;

        System.out.println();

        System.out.println("вопрос 2");
        System.out.println("Какой это вопрос");
        System.out.println("(1) (2) (3) (4)");
        answer = scan.nextInt();

        if (answer == 2) k++;

        System.out.println();

        System.out.println("вопрос 3");
        System.out.println("Какой это вопрос");
        System.out.println("(1) (2) (3) (4)");
        answer = scan.nextInt();

        if (answer == 3) k++;

        System.out.println();

        System.out.println("вопрос 4");
        System.out.println("Какой это вопрос");
        System.out.println("(1) (2) (3) (4)");
        answer = scan.nextInt();

        if (answer == 4) k++;

        System.out.println("Количество правильных ответов равно " + k);

    }
}
