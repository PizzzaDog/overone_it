package b_vitaliy.lesson_8;

public class Task2 {
    public static void main(String[] args) {

        int b;
        b = 2;
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ")Число " + b + " * " + b + " -1 = " + (b * b - 1));
            b = b * b - 1;
        }

    }
}
