package shukan_stanislaw.lesson_7;

import java.util.Scanner;

public class MyTest {
    public static void main(String[] args) {
        Question q1 = new Question("В какой стране находится Эйфелева башня?","В США","В России","Во Франции","В Германии",3);

        Question q2 = new Question("Столицей какой страны является город Хельсинки?","Финляндии","США","России","Италии",1);
        Question q3 = new Question("Сколько у собаки ушей?","Двадцать","Двое","Пятеро","Шестеро",2);


        Question[] test = new Question[]{q1,q2,q3};
        Scanner sc = new Scanner(System.in);
        for (Question vopros:test) {
            System.out.println("Ответьте на вопрос: ");
            System.out.println(vopros.predicate);
            System.out.println("Варианты ответа ");
            System.out.println("Вариант 1: "+ vopros.var1);
            System.out.println("Вариант 2: "+ vopros.var2);
            System.out.println("Вариант 3: "+ vopros.var3);
            System.out.println("Вариант 4: "+ vopros.var4);
            System.out.println("Ваш ответ: ");
            int otvet = sc.nextInt();
            if(otvet==vopros.answer){
                System.out.println("Верно");
            }
            else
                System.out.println("Неправильно");

        }
    }
}
