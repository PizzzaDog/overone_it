package o_glazdunova.lesson6;

public class MyArray {
    public static void main(String[] args) {
        int[] mass = new int[10]; // создаем массив типа int- целочисленный, в этом массиве 10ячеек,ячейки от 0 до 9, нодо будет еще присвоить значения ячеек.
        int[] mass2 = new int[]{1, 2, 3}; //так тоже можно создать массив и сразу присвоить ему значения ячеек.
        String[] stringArray = new String[]{"Первый", "Второй"}; //созд массив текстовой и сразу присваиваем ему значения ячеек
        Integer[] intArray = new Integer[]{1, 2, 3, 4, 5, 6};
        int size = mass.length;
        mass.clone();
//        System.out.println(mass2[1]); таким образом выводим в панель определенную ячейку из массива

        //Цикл по всем элементам массива
        for (int i = 0; i < mass2.length; i++) { //создаем цикл,чтобы приминить к каждой ячейке условие.
            System.out.println(mass2[i]);// таким образом выводим в панель определенную ячейку из массива
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

