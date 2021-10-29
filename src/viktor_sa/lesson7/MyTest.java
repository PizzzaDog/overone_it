package viktor_sa.lesson7;

import java.util.Scanner;

public class MyTest {
    public static void main(String[] args) {
        Question q1 = new Question();
        q1.predicate = "Сколько у собваки ушей?";
        q1.var1 = "Двадцать";
        q1.var2 = "Два";
        q1.answer = 2;

        Question q2 = new Question();
        q2.predicate = "Как дела?";
        q2.var1 = "Хорошо";
        q2.var2 = "Очень хорошо";
        q2.answer = 2;

        Question q3 = new Question("Легко?", " Easy", "Not Easy", 1);

        Question[] test = new Question[] {q1,q2,q3};

        Scanner scan = new Scanner(System.in);
        for(Question vopros : test) {
            System.out.print("Ответьте на вопрос: ");
            System.out.println(vopros.predicate);
            System.out.println("Варианты ответа: ");
            System.out.println("Вариант 1: " + vopros.var1);
            System.out.println("Вариант 2: " + vopros.var2);
            System.out.println("Ваш ответ?");
            int otvet = scan.nextInt();

            if (otvet == vopros.answer) {
                System.out.println("Верно!");
            } else {
                System.out.println("Неправильно!");
            }
        }
    }
}
