package viktor_sa.test2.task1;

import java.util.Scanner;

public class Stock extends Stones implements IRulesForStock {
    static Scanner scan = new Scanner(System.in);

    int countOfDiamondStock = 50;
    int countOfRubensStock = 80;
    int countOfSapphiresStock = 100;
    int walletOfStock = 1000000;

    String DiamondStock = countOfDiamondStock + " Бриллиантов, стоимостью " + Stones.coastOfDiamond + "$ за шт.";
    String RubensStock = countOfRubensStock + " Рубинов, стоимостью " + Stones.coastOfRuben + "$ за шт.";
    String SapphiresStock = countOfSapphiresStock + " Сапфиров, стоимостью " + Stones.coastOfSapphires + "$ за шт.";

    Client client1 = new Client("Bob", "12345", 10000, 20, 50, 700);
    Client client2 = new Client("Steve", "54321", 50000, 10, 100, 500);

    String inputLogin;
    String inputPass;

    int choiceOperate;

    int choiceBuy;
    int choiceSell;
    int choiceExchange;
    int choiceExchangeCurse;

    int choiceBuyDiamond;
    int choiceBuyRubens;
    int choiceBuySapphires;

    int coastBuyDiamond;
    int coastBuyRubens;
    int coastBuySapphires;

    int sumOfExchangeDiamondForRubens;
    int sumOfExchangeDiamondForSapphires;
    int sumOfExchangeRubensForSapphires;

    public void hello() {
        System.out.println("Приветствуем вас, уважаемый пользователь, для участия на торгах вам необходио авторизироваться. Пожалуйста, введите логин и пароль.");
        System.out.print("Логин: ");
        inputLogin = scan.nextLine();
        System.out.print("Пароль: ");
        inputPass = scan.nextLine();
        equalsLoginAndPass();
        System.out.println("Приветствуем, " + equalsLoginAndPass().getLogin());
    }

    public Client equalsLoginAndPass() {
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

    public void choiceOperation() {
        System.out.println("Выбирете какую опирацию вы хотели бы совершить.");
        System.out.println(" 1. Покупка драгоценных камней. \n 2. Продажа драгоценных камней. \n 3. Обмен драгоценных камней.");
        System.out.println("Пожалуйста, введите номер выбранной вами операции.");
        choiceOperate = scan.nextInt();

        if (choiceOperate == 1) {
            buy();
            clientInformation();
            continueOperation();
        } else if (choiceOperate == 2) {
            sell();
            clientInformation();
        } else if (choiceOperate == 3) {
            exchange();
            clientInformation();
            continueOperation();
        } else {
            System.out.println("Вы ввели неверный номер операции.");
            choiceOperation();
        }
    }

    public void continueOperation() {
        System.out.println("Хотите совершить еще одну операцию? \n 1. Да. \n 2. Нет.");
        int choose = scan.nextInt();
        if (choose == 1) {
            choiceOperation();
        }
    }


    public void buy() {
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


    public void equalsChoiceDiamondWithDiamondStock() {
        if (choiceBuyDiamond <= countOfDiamondStock) {
            System.out.println("Вы ввели недопустимое число камней, пожалуйста, повторите операцию.");
            buy();
        }
    }

    public void equalsChoiceRubenWithRubensStock() {
        if (choiceBuyRubens <= countOfRubensStock) {
            System.out.println("Вы ввели недопустимое число камней, пожалуйста, повторите операцию.");
            buy();
        }
    }

    public void equalsChoiceSapphiresWithDiamondStock() {
        if (choiceBuySapphires <= countOfSapphiresStock) {
            System.out.println("Вы ввели недопустимое число камней, пожалуйста, повторите операцию.");
            buy();
        }
    }


    public void equalsCoastBuyDiamond() {
        if (coastBuyDiamond <= equalsLoginAndPass().getWallet()) {
            equalsLoginAndPass().setWallet(equalsLoginAndPass().getWallet() - coastBuyDiamond);
        } else {
            System.out.println("У вас недостаточно средств, пожалуйста, повторите операцию.");
            buy();
        }
    }

    public void equalsCoastBuyRubens() {
        if (coastBuyRubens <= equalsLoginAndPass().getWallet()) {
            equalsLoginAndPass().setWallet(equalsLoginAndPass().getWallet() - coastBuyRubens);
        } else {
            System.out.println("У вас недостаточно средств, пожалуйста, повторите операцию.");
            buy();
        }
    }

    public void equalsCoastBuySapphires() {
        if (coastBuySapphires <= equalsLoginAndPass().getWallet()) {
            equalsLoginAndPass().setWallet(equalsLoginAndPass().getWallet() - coastBuySapphires);
        } else {
            System.out.println("У вас недостаточно средств, пожалуйста, повторите операцию.");
            buy();
        }
    }


    public void sell() {
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

    public void equalsChoiceDiamondWithDiamondClient() {
        if (choiceBuyDiamond <= equalsLoginAndPass().getCountOfDiamond()) {
            System.out.println("Вы ввели недопустимое число камней, пожалуйста, повторите операцию.");
            buy();
        }
    }

    public void equalsChoiceRubenWithRubensClient() {
        if (choiceBuyRubens <= equalsLoginAndPass().getCountOfRubens()) {
            System.out.println("Вы ввели недопустимое число камней, пожалуйста, повторите операцию.");
            buy();
        }
    }

    public void equalsChoiceSapphiresWithDiamondClient() {
        if (choiceBuySapphires <= equalsLoginAndPass().getCountOfSapphires()) {
            System.out.println("Вы ввели недопустимое число камней, пожалуйста, повторите операцию.");
            buy();
        }
    }

    public void equalsCoastDiamondWithWalletOfStock() {
        if (coastBuyDiamond <= walletOfStock) {
            equalsLoginAndPass().setWallet(equalsLoginAndPass().getWallet() + coastBuyDiamond);
        } else {
            System.out.println("К сожалению, на бирже нет такой суммы, пожалуйста, повторите операцию.");
            sell();
        }
    }

    public void equalsCoastRubensWithWalletOfStock() {
        if (coastBuyRubens <= walletOfStock) {
            equalsLoginAndPass().setWallet(equalsLoginAndPass().getWallet() + coastBuyRubens);
        } else {
            System.out.println("К сожалению, на бирже нет такой суммы, пожалуйста, повторите операцию.");
            sell();
        }
    }

    public void equalsCoastSapphiresWithWalletOfStock() {
        if (coastBuySapphires <= walletOfStock) {
            equalsLoginAndPass().setWallet(equalsLoginAndPass().getWallet() + coastBuySapphires);
        } else {
            System.out.println("К сожалению, на бирже нет такой суммы, пожалуйста, повторите операцию.");
            sell();
        }
    }


    public void exchange() {
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


    public void equalsSumOfExchangeDiamondForRubens() {
        if (sumOfExchangeDiamondForRubens <= countOfRubensStock) {
            System.out.println("К сожалению, у нас нет стольк рубинов, пожалуйста, повторите операцию.");
            exchange();
        }
    }

    public void equalsSumOfExchangeDiamondForSapphires() {
        if (sumOfExchangeDiamondForSapphires <= countOfSapphiresStock) {
            System.out.println("К сожалению, у нас нет стольк сапфиров, пожалуйста, повторите операцию.");
            exchange();
        }
    }

    public void equalsSumOfExchangeRubensForSapphires() {
        if (sumOfExchangeRubensForSapphires <= countOfSapphiresStock) {
            System.out.println("К сожалению, у нас нет стольк сапфиров, пожалуйста, повторите операцию.");
            exchange();
        }
    }

    public void clientInformation() {
        System.out.println("Ваш баланс составляет: " + equalsLoginAndPass().wallet + ". Колличесвто бриллиантов: " +  equalsLoginAndPass().countOfDiamondClient + ". Колличесвто рубинов: " +  equalsLoginAndPass().countOfRubensClient + ". Колличество сапфиров: " +  equalsLoginAndPass().countOfSapphiresClient);
    }
}
