package shkrob.lesson8;

import java.util.Scanner;

public class MyTest {
    public  static  void main(String[] arg) {
        Question q1 = new Question();
            q1.question = "Сколько у собаки ушей";
            q1.var1 = "двадцать";
            q1.var2 = "два";
            q1.answer = 2;

            Question q2 = new Question();
            q2.question = 'Да';
            q2. var1 = "ДА!";
            q2. var2 = "НЕТ!";
            q2.answer = 2;

            Question q3 = new Question("Легко?","Изи", "Ну как-то так", 2);

            Question[] test = new Question[] {q1, q2};
        Scanner sc = new Scanner(System.in);

        //foreacn - пробег по всему массиву
        for (Question vopros : test) {
            System.out.print("Ответ на вопрос");
            System.out.println("vopros.predicater");
            System.out.println("Варианты ответов");
            System.out.println("Варианты ответов");

        }
    }

}
