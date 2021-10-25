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
                System.out.println("  2.Выбери значение типа int  \n а.5 \t b.2.85 \t c.Hello! ");
               score= otvet(a,score);
                System.out.println(" 3. Что выведится в консоль \n int s=50, a=45;\nSystem.out.print(s) \n а.45 \t b.15 \t c.50 ");
               score=  otvet(c,score);
                break;
            }

            case 2: {
                System.out.println("Java условные операторы ветвления");
                System.out.println( " 1. Выберите условные операторы \n а.if \t b.System.out.print() \t c.case ");
                score=  otvet(a, score);
                System.out.println(" 2. Продолжите\n swich(i){...} \n а.case \t b.break \t c.else ");
                score= otvet(a,score);
                System.out.println(" 3. Что выведится в консоль\n int i=2;\n if(i=2){System.out.print(i)}\n else System.out.print(i-5) \n а.2 \t b.Будет ошибка \t c.-3 ");
                score=  otvet(b,score);

                break;
            }

            case 3: {
                System.out.println("Java циклы");
                System.out.println( " 1. Выберите цикл \n а.do \t b.for \t c.if ");
                score=  otvet(b, score);
                System.out.println(" 2. Продолжие\n for(...) \n а.int i=1; i++; i=45 \t b.int i<20; i=20 \t c.int i=1; i<=45;i++ ");
                score= otvet(c,score);
                System.out.println(" 3. Что выведится в консоль\n int i=4;\n do{\n System.out.print(i)} \n while(i<3)\n а.Ошибка \t b.4 \t c.3 ");
                score=  otvet(b,score);
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
