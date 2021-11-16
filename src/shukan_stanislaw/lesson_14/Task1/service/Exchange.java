package shukan_stanislaw.lesson_14.Task1.service;

import shukan_stanislaw.lesson_14.Task1.Client.Client;

import java.util.Scanner;

public class Exchange {
    public int moneyToTrade(Client client, int br, int rub) {
        Scanner sc = new Scanner(System.in);
        int money;
        System.out.println("Введите количество денег, на которые вы хотите купить камни " + client.getName());
        money = sc.nextInt();
        client.setWallet(client.getWallet() - money);
        int exchangeMoney = money / 100;
        money -= exchangeMoney;
        System.out.println(client.getWallet());
//        System.out.println(exchangeMoney);
//        System.out.println(money);
        return br;
    }

    public void authorization(Client client) {
        System.out.println("Введите ваш логин " + client.getName() + " ");
        Scanner sc = new Scanner(System.in);
        int log1 = sc.nextInt();
        if (log1 == client.getLogin()) {
            System.out.println("Вы успешно вошли на биржу " + client.getName());
        } else if (log1 != client.getLogin()) {
            System.out.println("Повторите вход еще раз!");
        }
    }

    public void choice(Client client) {
        System.out.println(client.getName() + " выберите, интересующую вас операцию : (выберите 1 для торговли и 2 для обмена)");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Отличный выбор, сейчас подберем человека с которым вы можете поторговаться");
        } else {
            System.out.println("Отличный выбор, сейчас подберем человека с которым вы можете обменяться");

        }
//        int choice1 = sc.nextInt();
//        if (choice1 == 1) {
//            System.out.println(client.getName() + " выберите, интересующую вас операцию : (выберите 1 для торговли и 2 для обмена)");
////            System.out.println("Отличный выбор, сейчас подберем человека с которым вы можете поторговаться");
////        } else {
////            System.out.println("Отличный выбор, сейчас подберем человека с которым вы можете обменяться");
////        }
//        if(choice==choice1){
//            System.out.println("Отлично, можете проводить операции");
//        } else {
//            System.out.println("Извините, ваши интересы не совпали попробуйте еще раз позже");
//        }
    }
}
