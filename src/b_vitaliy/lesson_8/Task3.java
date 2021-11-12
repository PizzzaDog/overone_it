package b_vitaliy.lesson_8;

public class Task3 {
    public static void main(String[] args) {
        int[] mass = new int[]{5, 18, 253, 762, 12, 333, 59, 78, 92, 25, 78, 25, 26, 27, 28};

        int a = 0, s = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 == 0) {
                while (mass[i] > 0) {
                    a = mass[i] % 10;
                    mass[i] = mass[i] / 10;
                    s += a;
                }
                System.out.print(s + ", ");
                s = 0;
            }
        }
    }
}
