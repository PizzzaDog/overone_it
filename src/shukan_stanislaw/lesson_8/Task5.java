package shukan_stanislaw.lesson_8;

import java.util.Scanner;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int answer;
        int wings = 20;
        int legs = 10;
        int fries = 5;
        int i;
        Food zakaz = new Food();

        for (i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            Client human = new Client();
            System.out.println("Здравствуйте,введите ваше имя!");
            human.order = zakaz;
            human.name = sc.nextLine();
            System.out.println("Здравствуйте, " + human.name + ". Вы будете делать заказ? \n1)Да!\n2)Нет!");
                answer = sc.nextInt();
            System.out.println("У нас осталось " + wings + " крылышек, " + legs+ " ножек, " + fries + " картошек фри" );
                if (answer == 1) {
                    System.out.println("Введите количество крылышек");
                    zakaz.wings = sc.nextInt();
                    System.out.println("Введите количество ножек");
                    zakaz.legs = sc.nextInt();
                    System.out.println("Введите количество картошек");
                    zakaz.fries = sc.nextInt();
                    if ((zakaz.fries <= fries) && (zakaz.legs <= legs) && (zakaz.wings <= wings)) {
                        fries -= zakaz.fries;
                        legs -= zakaz.legs;
                        wings -= zakaz.wings;
                        i++;
                    } else System.out.println("Переделайте заказ! У нас что-то закончилось!");
                } else break;
            }


       }
    }

