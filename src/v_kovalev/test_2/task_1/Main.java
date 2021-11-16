package v_kovalev.test_2.task_1;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean loop = true;
        boolean checkLogin = true;
        Client client1 = new Client("Bob");
        Exchange exchange = new Exchange();
        client1.addDiamondToClient1(client1, client1.diamondOfClient1);
        client1.addRubyToClient1(client1, client1.rubyOfClient1);
        exchange.addDiamondToExchange(exchange, exchange.diamondOfExchange);
        exchange.addRubyToExchange(exchange, exchange.rubyOfExchange);
        while (checkLogin) {
            System.out.println("Введите логин клиента:");
            String login = scanner.next();
            if (login.equals(client1.getLogin())) {
                while (loop) {
                    System.out.println("Введите число:\n0 - выход\n1 - покупка\n2 - продажа\n3 - обмен\n4 - количество бриллиантов у клиента\n" +
                            "5 - количество рубинов у клиента\n6 - количество бриллиантов на бирже\n7 - количество рубинов на бирже\n" +
                            "8 - количество денег у клиента");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Введите число:\n0 - выход\n1 - покупка\n2 - продажа\n3 - обмен\n4 - количество бриллиантов у клиента\n" +
                                "5 - количество рубинов у клиента\n6 - количество бриллиантов на бирже\n7 - количество рубинов на бирже\n" +
                                "8 - количество денег у клиента");
                        scanner.next();
                    }
                    int input = scanner.nextInt();
                    switch (input) {
                        case 0:
                            loop = false;
                            break;
                        case 1:
                            System.out.println("Что вы хотите купить?\n1 - бриллиант\n2 - рубин");
                            while (!scanner.hasNextInt()) {
                                System.out.println("Введите число");
                                scanner.next();
                            }
                            int inputToBuy = scanner.nextInt();
                            switch (inputToBuy) {
                                case 1:
                                    Diamond diamond = new Diamond();
                                    diamond.buy(client1, exchange);
                                    break;
                                case 2:
                                    Ruby ruby = new Ruby();
                                    ruby.buy(client1, exchange);
                                    break;
                                default:
                                    System.out.println("Неверный ввод");
                            }
                            break;
                        case 2:
                            System.out.println("Что вы хотите продать?\n1 - бриллиант\n2 - рубин");
                            while (!scanner.hasNextInt()) {
                                System.out.println("Введите число");
                                scanner.next();
                            }
                            int inputToSell = scanner.nextInt();
                            switch (inputToSell) {
                                case 1:
                                    Diamond diamond = new Diamond();
                                    diamond.sell(client1, exchange);
                                    break;
                                case 2:
                                    Ruby ruby = new Ruby();
                                    ruby.sell(client1, exchange);
                                    break;
                                default:
                                    System.out.println("Неверный ввод");
                            }
                            break;
                        case 3:
                            System.out.println("Что вы хотите обменять?\n1 - бриллиант  на рубин\n2 - рубин на бриллиант");
                            while (!scanner.hasNextInt()) {
                                System.out.println("Введите число");
                                scanner.next();
                            }
                            int inputToChange = scanner.nextInt();
                            switch (inputToChange) {
                                case 1:
                                    Diamond diamond = new Diamond();
                                    diamond.change(client1, exchange);
                                    break;
                                case 2:
                                    Ruby ruby = new Ruby();
                                    ruby.change(client1, exchange);
                                    break;
                                default:
                                    System.out.println("Неверный ввод");
                            }
                            break;
                        case 4:
                            for (Diamond d : client1.diamondOfClient1) {
                                System.out.println(d.getName());
                            }
                            break;
                        case 5:
                            for (Ruby r : client1.rubyOfClient1) {
                                System.out.println(r.getName());
                            }
                            break;
                        case 6:
                            for (Diamond d : exchange.diamondOfExchange) {
                                System.out.println(d.getName());
                            }
                            break;
                        case 7:
                            for (Ruby r : exchange.rubyOfExchange) {
                                System.out.println(r.getName());
                            }
                            break;
                        case 8:
                            System.out.println(client1.getMoney());
                            break;
                        default:
                            System.out.println("Неверный ввод");
                    }
                }
            } else {
                System.out.println("Неверный логин");
                System.out.println("Хотите попробовать войти еще раз?\n1 - да\n2 - нет");
                int tryLogin = scanner.nextInt();
                switch (tryLogin) {
                    case 1:
                        break;
                    default:
                        return;
                }
            }
        }
    }
}
