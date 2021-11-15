package viktor_sa.Test2.Task1;

import java.util.Scanner;

public class Stock {
    static Scanner scan = new Scanner(System.in);
    static String inputUserLogin = scan.nextLine();

    Client client1 = new Client("Farhar", "123450", 1000, 5, 15, 1000);
    Client client2 = new Client("Abdyl","789456", 5000, 10, 100, 500);


    public static void main(String[] args) {

    }

    public static void authorization() {
        System.out.println("Приветствуем вас, уважаемый пользователь. Для начала торгов авторизируйтесь в системе.");
        System.out.println("Логин: " + inputUserLogin);
        if (inputUserLogin == Client.login) {

        }

    }
}
