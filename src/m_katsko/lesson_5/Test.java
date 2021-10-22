package m_katsko.lesson_5;

import java.util.Scanner;

/*
3-5 вопроса. несколько вариантов вопроса. если правильны- начисляются баллы, если не-отнимаются
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in), test = new Scanner(System.in);
        String a = "a", b = "b", c = "c", ans, resault;
        int score=50;
        System.out.println("Выберите тему теста \n 1.Java типы данных \n 2.Java условные операторы \n 3.Java циклы \n 4.Выход");

        System.out.print("Выш выбор: ");
        int chose = sc.nextInt();
        switch (chose) {
            case 1: {
                System.out.println( "Java типы данных \n  1. Выберите примитив \n а.Integer \t b.Float \t c.boolean ");
              score=  otvet(c, score);
                System.out.println("  2. Выберите примитив \n а.int \t b.Float \t c.Boolean ");
               score= otvet(a,score);
                System.out.println(" 3. Выберите примитив \n а.double \t b.Float \t c.String ");
               score=  otvet(a,score);
                break;
            }

            case 2: {
                System.out.println("Java условные операторы");
                System.out.println( " 1. Выберите условные операторы \n а.Integer \t b.Float \t c.boolean ");
                score=  otvet(c, score);
                System.out.println(" 2. Выберите примитив \n а.int \t b.Float \t c.Boolean ");
                score= otvet(a,score);
                System.out.println(" 3. Выберите примитив \n а.double \t b.Float \t c.String ");
                score=  otvet(a,score);

                break;
            }

            case 3: {
                System.out.println("Java циклы");
                System.out.println( " 1. Выберите примитив \n а.Integer \t b.Float \t c.boolean ");
                score=  otvet(c, score);
                System.out.println(" 2. Выберите примитив \n а.int \t b.Float \t c.Boolean ");
                score= otvet(a,score);
                System.out.println(" 3. Выберите примитив \n а.double \t b.Float \t c.String ");
                score=  otvet(a,score);
                break;
            }

            default: {
                System.out.println("Хорошего дня!");
            }


        }
    }
    public  static int otvet (String resault,int score){
        Scanner test = new Scanner(System.in);
        String ans;
        System.out.print("Выш выбор: ");
        ans = test.nextLine();
        if (ans.equalsIgnoreCase(resault)) {
            System.out.println("Правильный ответ");
             score=score + 25;
            System.out.println("В ваши баллы: " + score );
        }
        else {
            System.out.println("Непрывильный ответ");
            score=score - 25;
            System.out.println("В ваши баллы: " + score);
        }
        return score;
    }
}
