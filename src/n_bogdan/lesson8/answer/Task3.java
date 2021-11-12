package n_bogdan.lesson8.answer;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[]{15, 18, 253, 762, 12, 333, 59, 78, 92, 25, 78, 25, 26, 27, 28};

//        System.out.println(21 % 10);
        int sum = 0;
        for (int a : array) {
            if (a % 2 == 0) {
                while (a != 0) {
                    sum += a % 10;
                    a = a / 10;
                }
                System.out.print(sum + ", ");
                sum = 0;
            }
        }
        System.out.print("\b\b.");
    }
}
