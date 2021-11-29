package o_glazdunova.lesson4;

import java.util.Scanner;

public class ForTemplate {
    public static void main(String[] args) {
        String name = "Nikolai";
    for (int i = 1; i<= 5; i++) {
        System.out.println(name);
    }
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите количество итераций");
    int i = sc.nextInt();
    for (int k = 1; k <= i; k++){
        System.out.print("Проход: " + k + " ");
        if (k == 15) {
            break;
        }
        System.out.println("Мы все еще не добрались до 15");
    }
    System.out.println("Цикл завершен");
}
}
