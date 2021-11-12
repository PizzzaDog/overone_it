package shkrob.lesson9;

public class MyArray {
    public static void  main(String[] args) {
        int[] array = new int[]{15, 18, 253, 762, 12, 333, 59, 78, 92, 25, 78, 25, 26, 27, 28};

        System.out.println();

        System.out.println(21 % 10);
        int sum = 0;
        for (int a : array)
            if (a % 2 == 0) {
                while (a != 0) {

                    System.out.println(a % 10 + ", ");
                    a = a / 10;

                }

            }

    }
}

