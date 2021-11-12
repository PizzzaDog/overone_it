package shukan_stanislaw.lesson_2;


    import java.util.Random;
import java.util.Scanner;

    /**
     * Ввести число с клавиатуры
     * scanner.nextInt();
     * <p>
     * Ввести строку
     * scanner.nextLine();
     * <p>
     * Ввести определенный тип
     * scanner.next***
     */

    public class ConsoleTask {
        public static void main(String[] args) {
            // Equals null
            int number;
            // Объект класса Scanner, служащий для ввода с клавиатуры
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите число \n с клавиатуры ");
            number = scanner.nextInt();
            System.out.println("Вы ввели число: " + number);

            // Объект класса Random, служащий для генерации случайных чисел
            Random random = new Random();
            Integer winner = random.nextInt(4000000);
            System.out.println(winner);
        }
    }

