package viktor_sa.homework.restaran;

public class Client {
    static String name;
    static int orderWings;
    static int orderLegs;
    static int orderPotatoes;

    public Client() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Client.name = name;
    }

    public int getOrderWings() {
        return orderWings;
    }

    public void setOrderWings(int orderWings) {
        Client.orderWings = orderWings;
    }

    public int getOrderLegs() {
        return orderLegs;
    }

    public void setOrderLegs(int orderLegs) {
        Client.orderLegs = orderLegs;
    }

    public int getOrderPotatoes() {
        return orderPotatoes;
    }

    public void setOrderPotatoes(int orderPotatoes) {
        Client.orderPotatoes = orderPotatoes;
    }

}
