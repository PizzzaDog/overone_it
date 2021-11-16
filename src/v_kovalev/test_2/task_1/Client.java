package v_kovalev.test_2.task_1;

import java.util.ArrayList;

public class Client {
    private String login;
    private int money;
    ArrayList<Diamond> diamondOfClient1 = new ArrayList<>();
    ArrayList<Ruby> rubyOfClient1 = new ArrayList<>();

    public Client(String login) {
        this.login = login;
        this.money = 2500;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void addDiamondToClient1(Client client, ArrayList diamondOfClient1) {
        for (int i = 0; i < 2; i++) {
            client.diamondOfClient1.add(new Diamond());
        }
    }

    public void addRubyToClient1(Client client, ArrayList rubyOfClient1) {
        for (int i = 0; i < 4; i++) {
            client.rubyOfClient1.add(new Ruby());
        }
    }
}
