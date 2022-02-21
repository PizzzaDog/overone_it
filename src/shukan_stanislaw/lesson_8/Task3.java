package shukan_stanislaw.lesson_8;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[]{15, 18, 253, 762, 12, 333, 59, 78, 92, 25, 78, 25, 26, 27, 28};
        int s, k, i;
        s = 0;
        k = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                while (array[i] > 0) {
                    k = array[i] % 10;
                    array[i] = array[i] / 10;
                    s += k;
                }
                System.out.print(s + " ");
                s = 0;
            }

        }

    }
}
