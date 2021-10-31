package a_rogatko.lesson9;

import java.util.Scanner;

public class MyGame {
    public static void main(String[] args) throws InterruptedException {
        Game.run();
    }
}
class Wallet {//Класс для хранения данных кошелька
    private static int balance; //Переменная кошелька, сколько денях
    static boolean payment(int pay) { //Метод для внесения денег на счет, с возможностью проверки успешности операции
        if (pay > 0) {
            balance = balance + pay;
            return true;
        } else {
            return false;
        }

    }
    static boolean debit(int debitOfBalance) { //Метод для списания денег с кошелька с возможностью проверки успешности операции
        if (debitOfBalance > 0) {
            balance = balance - debitOfBalance;
            return true;
        } else {
            return false;
        }
    }
    static int viewBalance() {//Метод получения данных о сумме в кошельке
        return balance;
    }
    static void forceSetBalance(int newBalance) {//Метод принудительной установки суммы в кошельке, в данной программе испоьзоваться не будет
        balance = newBalance;
    }
}
class Game {//Класс игры
    static	void run() throws InterruptedException {//Метод игры, основной и единственный, т.к. в других не видел особого смысла
        int summBet = 0;//Переменная суммы ставки
        System.out.print("Вас приветствует наше казино для умственно отсталых");
        Thread.sleep(1000);
        System.out.print("\r");
        System.out.println("Вас приветствует наше казино!!!");//Приветствие
        Scanner scanner = new Scanner(System.in);
        if (Wallet.viewBalance() == 0) {//Пополнение баланса при нулевом балансе кошелька
            System.out.println("Введите сумму пополнения баланса");

            Wallet.payment(scanner.nextInt());//Собственно, вызов самого метода пополнения



        }
        while (Wallet.viewBalance() > 0) {//Цикл игры, пока на счету есть деньги
            while (summBet > Wallet.viewBalance() || summBet == 0) {//Защита от ставки, большей баланса кошелька, нулевой ставки и зацикливание в одном флаконе, зацикливание будет осуществляться присвоением переменной summBet нуля
                System.out.println("Введите сумму cтавки!");
                summBet = scanner.nextInt();
                if (summBet > Wallet.viewBalance()) {
                    System.out.println("Недостаточно средств \n Уменьшите ставку \n Ваш баланс: " + Wallet.viewBalance());
                }
                if (summBet == 0) {
                    System.out.println("Ставка не может быть равна нулю");
                }
            }
            System.out.println("Выберите 1/0 ?");
            int bet = scanner.nextInt();
            if (bet == (int)((Math.random() * 2))) {//Сравниваем ставку с результатом генератора псевдослучайных чисел
                System.out.println("Поздравляем! \n Вы выиграли "+summBet);
                Wallet.payment(summBet);//зачисление суммы ставки
                System.out.println("Ваш баланс: " + Wallet.viewBalance());//Демонстрация баланса
            } else {
                System.out.println("Вы проиграли :(");
                Wallet.debit(summBet);//Списание суммы ставки

            }
            summBet = 0;//Присваивание переменной summBet нуля для зацикливания


        }
    }
}

