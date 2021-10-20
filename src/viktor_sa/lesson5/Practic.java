package viktor_sa.lesson5;

import java.util.Scanner;

public class Practic {
    public static void main(String[] args) {
        String name = "Viktor";

        for (int i = 1; i <= 5; i++) {
            System.out.println(name);
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество иттераций:");
        int i = scan.nextInt();

        for (int k = 0; k <= i; k++) {
            System.out.println("Проход: " + k + " ");
            if (k == 15) {
//                break; //Для выхода из цикла

                continue; //Для выхода из текущей итерации
            }
            System.out.println("Мы все еще не добрались до 15");
        }
        System.out.println("Цикл завершен.");


    }
}
