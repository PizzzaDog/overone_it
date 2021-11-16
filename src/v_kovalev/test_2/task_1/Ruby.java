package v_kovalev.test_2.task_1;

public class Ruby implements Stone {
    private String name;
    private int cost;

    public Ruby() {
        this.name = "ruby";
        this.cost = 500;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public void buy(Client client, Exchange exchange) {
        Ruby ruby = new Ruby();
        if (!exchange.rubyOfExchange.isEmpty()) {
            if (client.getMoney() > ruby.getCost()) {
                client.rubyOfClient1.add(ruby);
                exchange.rubyOfExchange.remove(0);
                client.setMoney(client.getMoney() - ruby.getCost());
            } else {
                System.out.println("Недостаточно денег");
            }
        } else {
            System.out.println("Рубинов на бирже нет");
        }
    }

    @Override
    public void change(Client client, Exchange exchange) {
        Diamond diamond = new Diamond();
        Ruby ruby = new Ruby();
        if (!client.rubyOfClient1.isEmpty()) {
            if (!exchange.diamondOfExchange.isEmpty()) {
                client.rubyOfClient1.remove(0);
                client.diamondOfClient1.add(diamond);
                exchange.rubyOfExchange.add(ruby);
                exchange.diamondOfExchange.remove(0);
                client.setMoney(client.getMoney() - diamond.getCost() + ruby.getCost());
            } else {
                System.out.println("На бирже нет бриллиантов");
            }
        } else {
            System.out.println("У вас нет рубинов");
        }
    }

    @Override
    public void sell(Client client, Exchange exchange) {
        Ruby ruby = new Ruby();
        if (!client.rubyOfClient1.isEmpty()) {
            client.rubyOfClient1.remove(0);
            exchange.rubyOfExchange.add(ruby);
            client.setMoney(client.getMoney() + ruby.getCost());
        } else {
            System.out.println("У вас нет рубинов для продажи");
        }
    }
}
