package m_katsko.lesson_8;

import java.util.Scanner;

public class MyTest {
    public static void main(String[] args) {
        int score = 50;
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите тему теста \n 1.Java типы данных \n 2.Java условные операторы \n 3.Java циклы \n 4.Выход");

        System.out.print("Выш выбор: ");
        int chose = sc.nextInt();
        switch (chose) {
            case 1: {
                System.out.println("Java типы данных");
                Qeshion q1 = new Qeshion("Выберите примитив", "Integer", "Float ", "boolean", 3);

                Qeshion q2 = new Qeshion("Выбери значение типа int", "5", "2.85", "Hello!", 1);

                Qeshion q3 = new Qeshion("Что выведится в консоль \n int s=50, a=45; \n System.out.print(s);", "45", "15", "50", 3);

                Qeshion[] test = new Qeshion[]{q1, q2, q3};
                otvet(score, test);

                break;
            }

            case 2: {
                System.out.println("Java условные операторы ветвления");

                Qeshion q1 = new Qeshion("Выберите условные операторы", "if", "System.out.print() ", "case", 1);

                Qeshion q2 = new Qeshion("Продолжите\n swich(i){...} ", "else", "case():", "break", 2);

                Qeshion q3 = new Qeshion("Что выведится в консоль\n int i=2;\n if(i=2){System.out.print(i)}\n else {System.out.print(i-5)};", "2", "будет ошшибка", "-3", 2);

                Qeshion[] test = new Qeshion[]{q1, q2, q3};
                otvet(score, test);


                break;
            }

            case 3: {
                System.out.println("Java циклы");
                Qeshion q1 = new Qeshion("Выберите цикл", "if", "for ", "do", 2);

                Qeshion q2 = new Qeshion("Продолжие\n for(...)", "int i=1; i++; i=45", "int i<20; i=20", "int i=1; i<=45; i++", 3);

                Qeshion q3 = new Qeshion("Что выведится в консоль\n int i=4;\n do{\n System.out.print(i)} \n while(i<3);", "3", "будет ошшибка", "4", 2);

                Qeshion[] test = new Qeshion[]{q1, q2, q3};
                otvet(score, test);

                break;
            }

            default: {
                System.out.println("Хорошего дня!");
            }


        }
    }

    public static int otvet(int score, Qeshion[] test) {
        System.out.println("Колличесто ваших баллов: " + score);
        Scanner sc = new Scanner(System.in);
        int answer;
        for (Qeshion vopros : test) {

            System.out.println("Ответьте на вопрос: ");
            System.out.println(vopros.tekst);
            System.out.println("1. " + vopros.var1);
            System.out.println("2. " + vopros.var2);
            System.out.println("3. " + vopros.var3);
            System.out.print(" Ваш ответ: ");
            answer = sc.nextInt();
            if (vopros.proverka(vopros.ittrue, answer)) {
                score = score + 25;
            } else {
                score = score - 25;
            }

            System.out.println("Колличесто ваших баллов: " + score);
        }
        return score;
    }
}

