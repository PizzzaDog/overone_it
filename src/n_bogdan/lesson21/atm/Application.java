package n_bogdan.lesson21.atm;

public class Application {
    public static void main(String[] args) {
        Bank bank = new Bank("Alfa Bank");
        bank.addExchangeRate(ExchangeType.BYN_USD, 2.59);
        bank.addExchangeRate(ExchangeType.USD_BYN, 2.581);

        Atm atm = new Atm(bank);
        atm.addCash(Currency.BYN, 10000);
        atm.addCash(Currency.USD, 10000);

        User user = new User("Bob");

        CreditCard creditCard = new CreditCard();
        creditCard.setCurrency(Currency.USD);
        creditCard.setBalance(200.0);
        //TODO заменить на String
        creditCard.setPinCode(1234);
        creditCard.setBank(bank);
        creditCard.setOwner(user);
        //TODO заменить на String
        creditCard.setNumber(12341234L);

        atm.service(creditCard);
        System.out.println(atm.getCurrencyBalance(Currency.BYN));
    }
}
