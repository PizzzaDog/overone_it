package viktor_sa.lesson8;

/**
 * 3. Дан массив:
 * int[] array = new int[] {15, 18, 253, 762, 12, 333, 59, 78, 92, 25, 78, 25, 26, 27, 28}
 * Пройтись по всему массиву, и если число четное, вывести в консоль сумму его цифр (через запятую, в одну строку, в конце точка)
 * Результат: 9, 15, 3, 15, 11, 15, 8, 10
 *
 */

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[] {15, 18, 253, 762, 12, 333, 59, 78, 92, 25, 78, 25, 26, 27, 28};
        int summa;
        for (int j : array) {
            if (j % 2 == 0) {
                summa = j / 10 + j % 10;

                if (j > 100) {
                    summa = j / 100 + j % 10 + (j / 100 - j % 10 / 10);
                }
                System.out.print (summa + ", ");
            }

        }
        System.out.print('\r' + '\b' + ".");
    }

}
