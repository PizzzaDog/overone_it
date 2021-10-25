package n_bogdan.lesson7;

import java.util.Scanner;

public class MyTest {
    public static void main(String[] args) {
        Question q1 = new Question();
        q1.predicate = "Сколько у собаки ушей?";
        q1.var1 = "двадцать";
        q1.var2 = "Два";
        q1.answer = 2;

        Question q2 = new Question();
        q2.predicate = "Да?";
        q2.var1 = "ДА!";
        q2.var2 = "Нет!";
        q2.answer = 1;

        Question q3 = new Question("Легко?", "Изи", "Ну как-то так", 2);

        Question[] test = new Question[] {q1, q2, q3};
        Scanner sc = new Scanner(System.in);

        //foreach - пробег по всему массиву
        for (Question vopros : test) {
            System.out.println("Ответьте на вопрос: ");
            // Выводим на консоль условие вопроса
            System.out.println(vopros.predicate);
            System.out.println("Варианты ответа:");

            // Выводим на консоль вариант ответа 1 от нашего Question объекта
            System.out.println("Вариант 1: " + vopros.var1);

            // Выводим на консоль вариант ответа 2 от нашего Question объекта
            System.out.println("Вариант 2: " + vopros.var2);

            System.out.println("Ваш ответ?");
            //Вводим наш вариант ответа
            int otvet = sc.nextInt();

            // У класса Question хранится answer - правильный ответ. Сравниваем.
            if (otvet == vopros.answer) {
                System.out.println("Верно!");
            } else {
                System.out.println("НЕПРАВИЛЬНААЫАЫАЫАЫАА");
            }
        }
    }
}
