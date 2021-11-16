package v_kovalev.homework.homework_1;

import java.util.Random;
import java.util.Scanner;

public class Homework_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("---------------");
            System.out.println("    Menu    ");
            System.out.println("enter 0 - exit\nenter 1 - task 1\nenter 2 - task 2\nenter 3 - task 3");
            System.out.println("---------------");
            while (!sc.hasNextInt()) {
                System.out.println("Incorrect enter!!!!");
                System.out.println("---------------");
                System.out.println("    Menu    ");
                System.out.println("enter 0 - exit\nenter 1 - task 1\nenter 2 - task 2\nenter 3 - task 3");
                System.out.println("---------------");
                sc.next();
            }
            int a = sc.nextInt();
            switch (a) {
                case 0:
                    loop = false;
                    break;
                case 1:
                    System.out.println("Задание 1\nРандомно вывести 20 чисел, каждое с новой строки\n" +
                            "Если число больше 10 добавить к нему *\n" +
                            "Если оно 11,12,13,14 - добавить еще одну *\n");
                    task_1();
                    break;
                case 2:
                    System.out.println("Задание 2\nСоздать 2 пароля\nВвести его с клавиатуры\n" +
                            "Если пароль основной вывести hello\n" +
                            "Если пароль запасной вывести hello,change your password\n" +
                            "Если пароль неверный вывести wrong password\n" +
                            "Если пароль не из 4 символов вывести Error\n");
                    task_2();
                    break;
                case 3:
                    System.out.println("Задание 3\nВывести в консоль таблицу умножения в виде квадрата\n");
                    task_3();
                    break;
                default:
                    System.out.println("incorrect enter");
            }
        }
    }

    public static void task_1() {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int random_number = random.nextInt(20);
            if (random_number > 10 && random_number != 11 && random_number != 12 && random_number != 13 && random_number != 14) {
                System.out.println(random_number + "*");
            } else if (random_number == 11 || random_number == 12 || random_number == 13 || random_number == 14) {
                System.out.println(random_number + "**");
            } else {
                System.out.println(random_number);
            }
        }
    }

    public static void task_2() {
        int password = 1234;
        int secondPassword = 8888;
        Scanner scanner = new Scanner(System.in);
        int checkPassword;
        do {
            System.out.println("Please enter password\nTo exit to menu enter 0");
            while (!scanner.hasNextInt()) {
                System.out.println("it isn't number \nPlease enter password again");
                scanner.next();
            }
            checkPassword = scanner.nextInt();
            if (checkPassword == 0) {
                return;
            } else if (checkPassword < 1000 || checkPassword > 9999) {
                System.out.println("Error");
            } else if (checkPassword == secondPassword) {
                System.out.println("Hello,please change your password");
            } else if (checkPassword == password) {
                System.out.println("Hello");
            } else {
                System.out.println("Wrong password,please enter password again");
            }
        } while (checkPassword != password && checkPassword != secondPassword);
    }

    public static void task_3() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
