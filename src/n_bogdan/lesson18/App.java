package n_bogdan.lesson18;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) throws MyOwnException {
        Random r = new Random();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(000);
        list.add(000);
        list.add(000);
        list.add(000);
        list.add(000);
        list.add(000);
        list.add(000);
        list.add(000);
        list.add(000);
        list.add(4);

//        try {
//            System.out.println(list.get(r.nextInt(10)));
//        }
//        catch (Exception k) {
//            System.out.println("");
//
//        } finally {
//            System.out.println("Это finnaly блок");
//        }
//
//        System.out.println("Идем дальше");

        System.out.println(someMethod());
        System.out.println(someMethod2());
        System.out.println(methodUsesThrowsMethod());
    }


    //Вариант 1 -  try/catch блоки
    private static Integer someMethod() {
        Integer number = 1;

        try {
            number += 1;
            throw new MyOwnException();
        } catch (MyOwnException e) {
            number += 1;
        } finally {
            number += 1;
        }

        return number;
    }

    //Варинт 2 - пробросить ошибку дальше с помощью ключевого слова throws
    private static Integer someMethod2() throws MyOwnException {
        throw new MyOwnException();
    }


    //Вариант 3 - обработать с помощью try/catch вызов метода throwsMethod(), который потенциально бросает ошибку

    private static Integer methodUsesThrowsMethod() {
        try {
            throw new MyOwnException();
        } catch (MyOwnException e) {
            System.out.println("Ошибочка");
        } finally {
            return 5;
        }
    }

    private static Integer throwsMethod() throws MyOwnException {
        throw new MyOwnException();
    }
}
