package shukan_stanislaw.lesson_3.homework;
import java.util.Scanner;
public class Task3_stanislaw {
    public static void main(String[] args) {
        Integer mainPass = 1258;
        Integer resPass = 1876;
        Scanner scan = new Scanner(System.in);
        Integer a = scan.nextInt();

        if (a.toString().length()!=4){
            System.out.println("Error!");
        }
        else{
            switch (a){
                case 1258:
                    System.out.println("Hello!");
                    break;
                case 1876:
                    System.out.println("Hello, change your password!");
                    break;
                default:
                    System.out.println("Wrong Password!");

            }
        }


    }
}
