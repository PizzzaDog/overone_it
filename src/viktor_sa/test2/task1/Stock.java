package viktor_sa.test2.task1;

import java.util.Scanner;

public class Stock extends Stones implements IRulesForStock {
    static Scanner scan = new Scanner(System.in);

    static int countOfDiamondStock = 50;
    static int countOfRubensStock = 80;
    static int countOfSapphiresStock = 100;
    static int walletOfStock = 1000000;

    static String DiamondStock = countOfDiamondStock + " Бриллиантов, стоимостью " + Stones.coastOfDiamond + "$ за шт.";
    static String RubensStock = countOfRubensStock + " Рубинов, стоимостью " + Stones.coastOfRuben + "$ за шт.";
    static String SapphiresStock = countOfSapphiresStock + " Сапфиров, стоимостью " + Stones.coastOfSapphires + "$ за шт.";

    static Client client1 = new Client("Bob", "12345", 10000, 20, 50, 700);
    static Client client2 = new Client("Steve", "54321", 50000, 10, 100, 500);

    static String inputLogin;
    static String inputPass;

    static int choiceOperation;

    static int choiceBuy;
    static int choiceSell;
    static int choiceExchange;
    static int choiceExchangeCurse;

    static int choiceBuyDiamond;
    static int choiceBuyRubens;
    static int choiceBuySapphires;

    static int coastBuyDiamond;
    static int coastBuyRubens;
    static int coastBuySapphires;

    static int sumOfExchangeDiamondForRubens;
    static int sumOfExchangeDiamondForSapphires;
    static int sumOfExchangeRubensForSapphires;

    public static void hello() {
        System.out.println("Приветствуем вас, уважаемый пользователь, для участия на торгах вам необходио авторизироваться. Пожалуйста, введите логин и пароль.");
        System.out.print("Логин: ");
        inputLogin = scan.nextLine();
        System.out.print("Пароль: ");
        inputPass = scan.nextLine();
        equalsLoginAndPass();
        System.out.println("Приветствуем, " + equalsLoginAndPass().getLogin());
    }

    public static Client equalsLoginAndPass() {
        if (inputLogin.equals(client1.getLogin()) && inputPass.equals(client1.getPass())) {
            return client1;

        } else if (inputLogin.equals(client2.getLogin()) && inputPass.equals(client2.getPass())) {
            return client2;
        } else {
            System.out.println("Вы ввели неверный логин или пароль, пожалуйста, попробуйте еще раз.");
            hello();
        }
        return null;
    }

    public static void choiceOperation() {
        System.out.println("Выбирете какую опирацию вы хотели бы совершить.");
        System.out.println(" 1. Покупка драгоценных камней. \n 2. Продажа драгоценных камней. \n 3. Обмен драгоценных камней.");
        System.out.println("Пожалуйста, введите номер выбранной вами операции.");
        choiceOperation = scan.nextInt();

        if (choiceOperation == 1) {
            buy();
            clientInformation(equalsLoginAndPass());
            continueOperation();
        } else if (choiceOperation == 2) {
            sell();
            clientInformation(equalsLoginAndPass());
        } else if (choiceOperation == 3) {
            exchange();
            clientInformation(equalsLoginAndPass());
            continueOperation();
        } else {
            System.out.println("Вы ввели неверный номер операции.");
            choiceOperation();
        }
    }

    public static void continueOperation() {
        System.out.println("Хотите совершить еще одну операцию? \n 1. Да. \n 2. Нет.");
        int choose = scan.nextInt();
        if (choose == 1) {
            choiceOperation();
        }
    }


    public static void buy() {
        System.out.println("Итак, вы решили совершить покупку драгоценных камней. В данный момент на бирже есть: ");
        System.out.println("1. " + DiamondStock + '\n' + "2. " + RubensStock + '\n' + "3. " + SapphiresStock);
        System.out.println("Введите под каким номером находится камень, который вы хотите купить.");
        choiceBuy = scan.nextInt();
        if (choiceBuy == 1) {
            System.out.println("Выбирете колличество бриллиантов, которое вы хотите купить.");
            choiceBuyDiamond = scan.nextInt();
            coastBuyDiamond = choiceBuyDiamond * Stones.coastOfDiamond;
            equalsChoiceDiamondWithDiamondStock();
            equalsCoastBuyDiamond();
            System.out.println("Поздравляем! Вы совершили покупку " + choiceBuyDiamond + " бриллиантов на общую стоимость " + coastBuyDiamond + "$");
        } else if (choiceBuy == 2) {
            System.out.println("Выбирете колличество рубинов, которое вы хотите купить.");
            choiceBuyRubens = scan.nextInt();
            coastBuyRubens = choiceBuyRubens * Stones.coastOfRuben;
            equalsChoiceRubenWithRubensStock();
            equalsCoastBuyRubens();
            System.out.println("Поздравляем! Вы совершили покупку " + choiceBuyRubens + " бриллиантов на общую стоимость " + coastBuyRubens + "$");
        } else if (choiceBuy == 3) {
            System.out.println("Выбирете колличество сапфиров, которое вы хотите купить.");
            choiceBuySapphires = scan.nextInt();
            coastBuySapphires = choiceBuySapphires * Stones.coastOfSapphires;
            equalsChoiceSapphiresWithDiamondStock();
            equalsCoastBuySapphires();
            System.out.println("Поздравляем! Вы совершили покупку " + choiceBuySapphires + " бриллиантов на общую стоимость " + coastBuySapphires + "$");
        }
    }


    public static void equalsChoiceDiamondWithDiamondStock() {
        if (choiceBuyDiamond <= countOfDiamondStock) {

        } else {
            System.out.println("Вы ввели недопустимое число камней, пожалуйста, повторите операцию.");
            buy();
        }
    }

    public static void equalsChoiceRubenWithRubensStock() {
        if (choiceBuyRubens <= countOfRubensStock) {

        } else {
            System.out.println("Вы ввели недопустимое число камней, пожалуйста, повторите операцию.");
            buy();
        }
    }

    public static void equalsChoiceSapphiresWithDiamondStock() {
        if (choiceBuySapphires <= countOfSapphiresStock) {

        } else {
            System.out.println("Вы ввели недопустимое число камней, пожалуйста, повторите операцию.");
            buy();
        }
    }


    public static void equalsCoastBuyDiamond() {
        if (coastBuyDiamond <= equalsLoginAndPass().getWallet()) {
            equalsLoginAndPass().setWallet(equalsLoginAndPass().getWallet() - coastBuyDiamond);
        } else {
            System.out.println("У вас недостаточно средств, пожалуйста, повторите операцию.");
            buy();
        }
    }

    public static void equalsCoastBuyRubens() {
        if (coastBuyRubens <= equalsLoginAndPass().getWallet()) {
            equalsLoginAndPass().setWallet(equalsLoginAndPass().getWallet() - coastBuyRubens);
        } else {
            System.out.println("У вас недостаточно средств, пожалуйста, повторите операцию.");
            buy();
        }
    }

    public static void equalsCoastBuySapphires() {
        if (coastBuySapphires <= equalsLoginAndPass().getWallet()) {
            equalsLoginAndPass().setWallet(equalsLoginAndPass().getWallet() - coastBuySapphires);
        } else {
            System.out.println("У вас недостаточно средств, пожалуйста, повторите операцию.");
            buy();
        }
    }


    public static void sell() {
        System.out.println("Итак, вы решили совершить продажу драгоценных камней. В данный момент на бирже есть: ");
        System.out.println(DiamondStock + '\n' + RubensStock + '\n' + SapphiresStock);
        System.out.println("Введите под каким номером находится камень, который вы хотите продать.");
        choiceSell = scan.nextInt();
        if (choiceSell == 1) {
            System.out.println("Выбирете колличество бриллиантов, которое вы хотите продать.");
            choiceBuyDiamond = scan.nextInt();
            coastBuyDiamond = choiceBuyDiamond * Stones.coastOfDiamond;
            equalsChoiceDiamondWithDiamondClient();
            equalsCoastDiamondWithWalletOfStock();
            System.out.println("Поздравляем! Вы совершили продажу " + choiceBuyDiamond + " бриллиантов на общую стоимость " + coastBuyDiamond + "$");
        } else if (choiceSell == 2) {
            System.out.println("Выбирете колличество рубинов, которое вы хотите продать.");
            choiceBuyRubens = scan.nextInt();
            coastBuyRubens = choiceBuyRubens * Stones.coastOfRuben;
            equalsChoiceRubenWithRubensClient();
            equalsCoastRubensWithWalletOfStock();
            System.out.println("Поздравляем! Вы совершили продажу " + choiceBuyRubens + " рубинов на общую стоимость " + coastBuyRubens + "$");
        } else if (choiceSell == 3) {
            System.out.println("Выбирете колличество сапфиров, которое вы хотите продать.");
            choiceBuySapphires = scan.nextInt();
            coastBuySapphires = choiceBuySapphires * Stones.coastOfSapphires;
            equalsChoiceSapphiresWithDiamondClient();
            equalsCoastSapphiresWithWalletOfStock();
            System.out.println("Поздравляем! Вы совершили продажу " + choiceBuySapphires + " сапфиров на общую стоимость " + coastBuySapphires + "$");
        }

    }

    public static void equalsChoiceDiamondWithDiamondClient() {
        if (choiceBuyDiamond <= equalsLoginAndPass().getCountOfDiamond()) {

        } else {
            System.out.println("Вы ввели недопустимое число камней, пожалуйста, повторите операцию.");
            buy();
        }
    }

    public static void equalsChoiceRubenWithRubensClient() {
        if (choiceBuyRubens <= equalsLoginAndPass().getCountOfRubens()) {

        } else {
            System.out.println("Вы ввели недопустимое число камней, пожалуйста, повторите операцию.");
            buy();
        }
    }

    public static void equalsChoiceSapphiresWithDiamondClient() {
        if (choiceBuySapphires <= equalsLoginAndPass().getCountOfSapphires()) {

        } else {
            System.out.println("Вы ввели недопустимое число камней, пожалуйста, повторите операцию.");
            buy();
        }
    }

    public static void equalsCoastDiamondWithWalletOfStock() {
        if (coastBuyDiamond <= walletOfStock) {
            equalsLoginAndPass().setWallet(equalsLoginAndPass().getWallet() + coastBuyDiamond);
        } else {
            System.out.println("К сожалению, на бирже нет такой суммы, пожалуйста, повторите операцию.");
            sell();
        }
    }

    public static void equalsCoastRubensWithWalletOfStock() {
        if (coastBuyRubens <= walletOfStock) {
            equalsLoginAndPass().setWallet(equalsLoginAndPass().getWallet() + coastBuyRubens);
        } else {
            System.out.println("К сожалению, на бирже нет такой суммы, пожалуйста, повторите операцию.");
            sell();
        }
    }

    public static void equalsCoastSapphiresWithWalletOfStock() {
        if (coastBuySapphires <= walletOfStock) {
            equalsLoginAndPass().setWallet(equalsLoginAndPass().getWallet() + coastBuySapphires);
        } else {
            System.out.println("К сожалению, на бирже нет такой суммы, пожалуйста, повторите операцию.");
            sell();
        }
    }


    public static void exchange() {
        System.out.println("Вы решили обменять ваши драгоценные камни на другие, пожалуйста, выберите из списка какой камень вы хотите поменять: ");
        System.out.println("1. Бриллиант.'\n' 2. Рубин. '\n' 3. Сапфир. ");
        choiceExchange = scan.nextInt();
        if (choiceExchange == 1) {
            System.out.println("Для бриллиантов у нас предусмотрено 2 курса обмена, выберите какой вам больше потходит: ");
            System.out.println("1. 1 бриллиант = 2 рубинам'\n' 2. 1 бриллиант = 5 сапфирам");
            choiceExchangeCurse = scan.nextInt();
            if (choiceExchangeCurse == 1) {
                System.out.println("Выбирете колличество бриллиантов, которое вы хотите обменять.");
                choiceBuyDiamond = scan.nextInt();
                sumOfExchangeDiamondForRubens = choiceBuyDiamond * 2;
                equalsChoiceDiamondWithDiamondClient();
                equalsSumOfExchangeDiamondForRubens();
                System.out.println("Поздравляем! Вы совершили обмен " + choiceBuyDiamond + " бриллиантов на " + sumOfExchangeDiamondForRubens + " рубинов.");
            } else if (choiceExchangeCurse == 2) {
                System.out.println("Выбирете колличество бриллиантов, которое вы хотите обменять.");
                choiceBuyDiamond = scan.nextInt();
                sumOfExchangeDiamondForRubens = choiceBuyDiamond * 5;
                equalsChoiceDiamondWithDiamondClient();
                equalsSumOfExchangeDiamondForSapphires();
                System.out.println("Поздравляем! Вы совершили обмен " + choiceBuyDiamond + " бриллиантов на " + sumOfExchangeDiamondForSapphires + " сапфиров.");
            }
        }
        if (choiceExchange == 2) {
            System.out.println("У нас вы сможете обменять рубины только на сапфиры по курсу: 1 рубин = 3 сапфира");
            System.out.println("Выбирете колличество рубинов, которое вы хотите обменять.");
            choiceBuyRubens = scan.nextInt();
            sumOfExchangeRubensForSapphires = choiceBuyDiamond * 3;
            equalsChoiceRubenWithRubensClient();
            equalsSumOfExchangeRubensForSapphires();
            System.out.println("Поздравляем! Вы совершили обмен " + choiceBuyRubens + " рубинов на " + sumOfExchangeRubensForSapphires + " сапфиров.");
        }
    }

    public static void equalsSumOfExchangeDiamondForRubens() {
        if (sumOfExchangeDiamondForRubens <= countOfRubensStock) {

        } else {
            System.out.println("К сожалению, у нас нет стольк рубинов, пожалуйста, повторите операцию.");
            exchange();
        }
    }

    public static void equalsSumOfExchangeDiamondForSapphires() {
        if (sumOfExchangeDiamondForSapphires <= countOfSapphiresStock) {

        } else {
            System.out.println("К сожалению, у нас нет стольк сапфиров, пожалуйста, повторите операцию.");
            exchange();
        }
    }

    public static void equalsSumOfExchangeRubensForSapphires() {
        if (sumOfExchangeRubensForSapphires <= countOfSapphiresStock) {

        } else {
            System.out.println("К сожалению, у нас нет стольк сапфиров, пожалуйста, повторите операцию.");
            exchange();
        }
    }


    public static void clientInformation(Client client) {
        System.out.println("Ваш баланс составляет: " + Client.wallet + ". Колличесвто бриллиантов: " + Client.countOfDiamondClient + ". Колличесвто рубинов: " + Client.countOfRubensClient + ". Колличество сапфиров: " + Client.countOfSapphiresClient);
    }
}
