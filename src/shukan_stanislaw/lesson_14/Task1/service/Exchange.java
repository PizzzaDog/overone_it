package shukan_stanislaw.lesson_14.Task1.service;

import shukan_stanislaw.lesson_14.Task1.Client.Client;
import shukan_stanislaw.lesson_14.Task1.gems.Brilliants;
import shukan_stanislaw.lesson_14.Task1.gems.Rubies;

import java.util.Scanner;

public class Exchange {


    public int moneyToTrade(Client client) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество денег, на которые вы хотите купить камни " + client.getName());
         int money = sc.nextInt();
        if (client.getWallet() < 0) {
            System.out.println("У вас не хватает денег!");
            return 0;
        }
        client.setWallet(client.getWallet() - money);
        int exchangeMoney = money / 100;//кол-во денег которое забирает биржа после каждой сделки
        money -= exchangeMoney;
        System.out.println(client.getWallet());
//        System.out.println(exchangeMoney);
//        System.out.println(money);
        return money;
    }
    public int rubiesAndBrilliantsToTrade(Client client, int rub, int br){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество рубинов, которые вы хотите обменять: " + client.getName() );
        int rubies = sc.nextInt();
        client.setRub(client.getRub() - rubies);
        if(client.getRub()<0){
            System.out.println("У вас не хватает рубинов, чтобы обмениваться " + client.getName());
        }
        int exchangeRubies = rubies/20;
        rubies -=exchangeRubies;
        System.out.println(client.getRub());


        return rubies;
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

    public int choice(Client client) {
        System.out.println(client.getName() + " выберите, интересующую вас операцию : (выберите 1 для торговли и 2 для обмена)");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Отличный выбор, сейчас подберем человека с которым вы можете поторговаться");
        } else {
            System.out.println("Отличный выбор, сейчас подберем человека с которым вы можете обменяться");
        }
        return choice;



    }
}

