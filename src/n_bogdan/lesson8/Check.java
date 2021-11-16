package n_bogdan.lesson8;

public class Check {
    public static void main(String[] args) {
        int[] array = new int[] {15, 18, 253, 762, 12, 333, 59, 78, 92, 25, 78, 25, 26, 27, 28};
        int summa = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                summa = array[i] / 10 + array[i] % 10;
                System.out.print(summa + ", ");
            }
        }
        System.out.print("\b\b" + ".");
    }
}
