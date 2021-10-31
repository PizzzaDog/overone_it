package a_rogatko.leeson8;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {12, 18, 253, 762, 12, 333, 59, 78, 92, 25, 26, 27, 28};
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                int b = 0;
                while (arr[i] > 0) {
                    b = arr[i] % 10 + b;
                    arr[i] = arr[i] / 10;
                }
                System.out.print(b + ", ");

            }


        }
        System.out.print("\b\b.");
    }
}
