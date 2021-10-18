package viktor_sa.homework.lesson3;

/**Вывести в консоль таблицу умножения от 1 до 10 в виде квадрата
 */

public class Task4 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i =1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", (i * j));
            }
            System.out.println();
        }
    }
}

