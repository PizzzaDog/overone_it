package viktor_sa.homework.lesson3;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {


/* 1. Написать 20 рандомных чисел от 0 до 20.
Каждое с новой строки.
Если число больше 10, после него ставится *
Пример:
7
15*
4
19*

2. Доработать первое задание, для чисел
11, 12, 13, 14 добавить еще одну *
 */


    public static void main(String[] args) {

        write(task2(task1(20)));

    }


    public static ArrayList<String> task1(int num) {
        ArrayList<String> myArrayList = new ArrayList<String>();

        Random rnd = new Random();
        String s;

        for (int i = 0; i < 20; i++) {
            num = rnd.nextInt(20);
            s = String.valueOf(num);
            if (num > 10) {
                myArrayList.add(s + "*");
            } else {
                myArrayList.add(s);
            }
        }
        return myArrayList;
    }

    public static void write(ArrayList<String> myArrayList) {

        for (int i = 0; i < myArrayList.size(); i++) { //output value list

            System.out.println(myArrayList.get(i));

        }


    }

    public static ArrayList<String> task2(ArrayList<String> myArrayList) {

        int num;
        String str;


        for (int i = 0; i < myArrayList.size(); i++) {


            str = myArrayList.get(i);
            num = str.length();

            if (num > 2) {

                if (str.charAt(1) == '1' || str.charAt(1) == '2' || str.charAt(1) == '3' || str.charAt(1) == '4') {

                    myArrayList.set(i, str + "*");

                }
            }

        }
        return myArrayList;

    }

}



