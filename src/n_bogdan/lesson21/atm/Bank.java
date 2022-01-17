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
        exchangeRates.put(type, rate);
    }

    public Double getExchangeRate(ExchangeType type) {
        Double rate = exchangeRates.get(type);
        if (rate == null) {
            return 0.0;
        }
        return rate;
    }
}
