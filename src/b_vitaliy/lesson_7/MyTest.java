package b_vitaliy.lesson_7;

import java.util.Scanner;

public class MyTest {
    public static void main(String[] args) {
        /*Question q1 = new Question();
        q1.question = "Сколько у собаки ушей";
        q1.var1 = "Двадцать";
        q1.var2 = "два";
        q1.answer = 2;*/
        Question q1 = new Question("Сколько у собаки ушей", "Двадцать", "два", 2);
        /*Question q2 = new Question();
        q2.question = "как это по счету вопрос";
        q2.var1 = "2";
        q2.var2 = "1";
        q2.answer = 1;*/
        Question q2 = new Question("как это по счету вопрос", "2", "1", 1);

        Question[] test = new Question[]{q1, q2};

        Scanner sc = new Scanner(System.in);

        for (Question vopros : test) {
            System.out.println("Ответте на вопрос: ");
            System.out.println(vopros.question);
            System.out.println("Условие вопроса: ");
            System.out.println("1)" + vopros.var1);
            System.out.println("2)" + vopros.var2);
            System.out.println("Выберите ответ:");
            int otvet = sc.nextInt();
            if (otvet == vopros.answer) System.out.println("Верно!");
            else System.out.println("НЕ ВЕРНО!!!");
        }


    }

}
