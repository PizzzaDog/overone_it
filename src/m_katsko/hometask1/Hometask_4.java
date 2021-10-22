package m_katsko.hometask1;

public class Hometask_4 {
    public static void main(String[] args) {
        int[] a;
        a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print((a[i] * j) + "  ");
                System.out.print('\n');

            }
        }
    }
}

