package v_kovalev.test_2.task_1;

import java.util.ArrayList;

public class Exchange {
    ArrayList<Diamond> diamondOfExchange = new ArrayList<>();
    ArrayList<Ruby> rubyOfExchange = new ArrayList<>();

    public void addDiamondToExchange(Exchange exchange, ArrayList diamondOfExchange) {
        for (int i = 0; i < 4; i++) {
            exchange.diamondOfExchange.add(new Diamond());
        }
    }

    public void addRubyToExchange(Exchange exchange, ArrayList rubyOfExchange) {
        for (int i = 0; i < 6; i++) {
            exchange.rubyOfExchange.add(new Ruby());
        }
    }
}
