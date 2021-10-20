package shukan_stanislaw.lesson_4;
import java.util.Scanner;

public class forTemplate {
    public static void main(String[] args) {
        String name = "Stanislaw";
        for (int i= 1; i<=5;i++) {
            System.out.println(name);
        }
            //С готовым счетчиком
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите кол-во итерации");
            int i = sc.nextInt();
            for (int k =1 ;k<=i;k++){
                System.out.print("Проход: "+ k + " ");
                if(k==15){
                    continue;
                }
                System.out.println("Мы все еще не добрались до 15");
            }
        System.out.println("Цикл завершен");
    }
    }

