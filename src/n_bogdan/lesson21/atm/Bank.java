package n_bogdan.lesson21.atm;


import java.util.HashMap;
import java.util.Map;

public class Bank {

    private String name;

    private Map<ExchangeType, Double> exchangeRates = new HashMap<>();


    public Bank(String name) {
        this.name = name;
    }

    public void addExchangeRate(ExchangeType type, Double rate) {
        //TODO Написать метод, который добавит в банк курс(rate)
        // для определенного типа обмена(type)
    }

    public Double getExchangeRate(ExchangeType type) {
        //TODO вернуть значение курса обмена для определенного типа(type) обмена
        return null;
    }
}
