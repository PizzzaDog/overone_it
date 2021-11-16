package v_kovalev.test_2.task_1;

public class Diamond implements Stone {
    private String name;
    private int cost;

    public Diamond() {
        this.name = "diamond";
        this.cost = 1000;
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
        Diamond diamond = new Diamond();
        if (!exchange.diamondOfExchange.isEmpty()) {
            if (client.getMoney() > diamond.getCost()) {
                client.diamondOfClient1.add(diamond);
                exchange.diamondOfExchange.remove(0);
                client.setMoney(client.getMoney() - diamond.getCost());
            } else {
                System.out.println("Недостаточно денег");
            }
        } else {
            System.out.println("Бриллиантов на бирже нет");
        }
    }

    @Override
    public void change(Client client, Exchange exchange) {
        Diamond diamond = new Diamond();
        Ruby ruby = new Ruby();
        if (!client.diamondOfClient1.isEmpty()) {
            if (!exchange.rubyOfExchange.isEmpty()) {
                client.diamondOfClient1.remove(0);
                client.rubyOfClient1.add(ruby);
                exchange.diamondOfExchange.add(diamond);
                exchange.rubyOfExchange.remove(0);
                client.setMoney(client.getMoney() + diamond.getCost() - ruby.getCost());
            } else {
                System.out.println("На бирже нет рубинов");
            }
        } else {
            System.out.println("У вас нет бриллиантов");
        }
    }

    @Override
    public void sell(Client client, Exchange exchange) {
        Diamond diamond = new Diamond();
        if (!client.diamondOfClient1.isEmpty()) {
            client.diamondOfClient1.remove(0);
            exchange.diamondOfExchange.add(diamond);
            client.setMoney(client.getMoney() + diamond.getCost());
        } else {
            System.out.println("У вас нет бриллиантов для продажи");
        }
    }

}
