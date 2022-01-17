package n_bogdan.lesson21.atm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Atm {

    private Map<Currency, Integer> cash;

    private final Bank bank;

    public Atm(Bank bank) {
        this.bank = bank;
        cash = new HashMap<>();
        cash.put(Currency.BYN, 0);
        cash.put(Currency.USD, 0);
    }


    public void addCash(Currency currency, Integer cashCount) {
        //Увеличиваем добавляемую сумму на ту, которая лежит в банкомате
        cashCount += cash.get(currency);
        //Заменяем сумму в банкомате по этой валюте новой суммой
        cash.put(currency, cashCount);
    }

    public Integer getCurrencyBalance(Currency currency) {
        return cash.get(currency);
    }

    public void service(CreditCard creditCard) {
        System.out.println("Введите пинкод");
        Scanner sc = new Scanner(System.in);
        //TODO когда пинкод изменится на String, заменить на .nextLine()
        int pincode = sc.nextInt();
        if (pincode == creditCard.getPinCode()) {
            System.out.println("Выберите операцию: " +
                    "\n1 - Снять наличные" +
                    "\n2 - Положить наличные" +
                    "\n3 - Посмотреть баланс");
            //TODO написать функционал
        } else {
            System.out.println("Вы ввели неправильный пинкод!");
        }
    }

    private void getCash(CreditCard card) {
        /*
        Должны указать, сколько хотим снять.
        Указать, в какой валюте.
        Если валюта совпадает с валютой карточки и денег в банкомате хватает
        Снимаем с карточки это количество и достаем из банкомата это же количество налички
        Если валюта не совпадает, мы делаем обмен по курсу (в зависимости от валюты карточки)
        И отдаем это кол-во налички, если оно есть в банкомате
         */
    }

    private void addCash(CreditCard card) {
        //TODO Добавить деньги в банкомат и на счет пользователя
    }

    private void showBalance(CreditCard card) {
        //TODO выводит в консоль баланс карточки
    }
}
