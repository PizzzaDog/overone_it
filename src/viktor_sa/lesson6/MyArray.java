package viktor_sa.lesson6;

public class MyArray {
    public static void main(String[] args) {
        int[] mass = new int[10];
        int[] mass2 = new int[]{1, 2, 3};
        String[] stringArray = new String[]{"Первый", "Второй"};

        int size = mass.length;
        mass.clone();

        for (int i = 0; i < mass2.length; i++) {
            System.out.println(mass2[i]);
        }

        for (int k : mass2) {
            System.out.println(k);
        }

    }
}
