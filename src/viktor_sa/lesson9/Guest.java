package viktor_sa.lesson9;

public class Guest {
    private String name;
    private int wallet;

    public Guest(String name, int wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    public Guest() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }
}
