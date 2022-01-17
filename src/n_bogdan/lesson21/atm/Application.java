package n_bogdan.lesson21.atm;

public class Application {
    public static void main(String[] args) {
        Atm atm = new Atm(new Bank("AlfaBank"));
        atm.addCash(Currency.BYN, 10000);
        System.out.println(atm.getCurrencyBalance(Currency.BYN));
    }
}
