package viktor_sa.lesson8;

/**
 * 4. Числа Фибоначчи - в которой первые два числа равны 0 и 1, а каждое последующее число равно сумме двух предыдущих чисел
 * Задача:
 * Написать последовательность чисел Фибоначчи начиная от 0 и до 1000
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987
 */
public class Task4 {
    public static void main(String[] args) {
        int d = 0;
        int a = 1;
        int b = 1;
        int c;
        System.out.print(d + ", " + a + ", " + b + ", ");
        for (int i = 3; i <= 16; i++) {
            c = a + b;
            System.out.print(c + ", ");
            a = b;
            b = c;
        }
        System.out.print('\r' + '\b' + ".");
    }
}
