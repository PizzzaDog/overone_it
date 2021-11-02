package viktor_sa.homework.restaran;

public class Client {
    static int maxClients = 5;
    String name;
    static int orderWings;
    static int orderLegs;
    static int orderPotatoes;



    public Client() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrderWings() {
        return orderWings;
    }

    public void setOrderWings(int orderWings) {
        this.orderWings = orderWings;
    }

    public int getOrderLegs() {
        return orderLegs;
    }

    public void setOrderLegs(int orderLegs) {
        this.orderLegs = orderLegs;
    }

    public int getOrderPotatoes() {
        return orderPotatoes;
    }

    public void setOrderPotatoes(int orderPotatoes) {
        this.orderPotatoes = orderPotatoes;
    }
}
