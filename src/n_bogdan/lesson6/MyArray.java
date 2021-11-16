package n_bogdan.lesson6;

public class MyArray {
    public static void main(String[] args) {
        int[] mass = new int[10];
        int[] mass2 = new int[]{1, 2, 3};
        String[] stringArray = new String[]{"Первый", "Второй"};
        Integer[] intArray = new Integer[]{1, 2, 3, 4, 5, 6};
        int size = mass.length;
        mass.clone();
//        System.out.println(mass2[1]);

        //Цикл по всем элементам массива
        for (int i = 0; i < mass2.length; i++) {
            System.out.println(mass2[i]);
        }

        /**
         * ФОРЫЫЫЫЫЫЧ
         * Для пробега по всему массиву целиком
         * Только для чтения
         */
        for (int k : mass2) {
            System.out.println(k);
            k = 5;
        }
        System.out.println(mass2[0]);
    }
}
