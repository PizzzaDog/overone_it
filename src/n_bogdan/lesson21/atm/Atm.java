package n_bogdan.lesson21.atm;

import java.util.HashMap;
import java.util.Map;

public class Atm {

    private Map<Currency, Integer> cash = new HashMap<>();

    private final Bank bank;

    public Atm(Bank bank) {
        this.bank = bank;
    }


    public void addCash(Currency currency, Integer cash) {
        //TODO метод, который добавляет в банкомат валюту
    }

    public Integer getCurrencyBalance(Currency currency) {
        return cash.get(currency);
    }


}
