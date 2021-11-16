package viktor_sa.lesson8;

/**
 * 2. Написать цикл, который выводит в консоль 10 раз следующее:
 *  1) Число 3*3 - 1 = 5
 *  2) Число 5*5 - 1 = 24
 *  3) Число 24*24 - 1 = 576
 * И так далее до 10)
 */

public class Task2 {
    public static void main(String[] args) {

        int a = 5;
        int b = 19;
        int c;
        for (int i = 1; i < 6; i++) {
            c = a + b * (i - 1);
            System.out.println(c);

        }


    }
}
