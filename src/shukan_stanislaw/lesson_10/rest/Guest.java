package shukan_stanislaw.lesson_10.rest;

public class Guest {
    private int wallet;

    private String name;

    public int getWallet() {
        return wallet;
    }

    public Guest(int wallet, String name) {
        this.wallet = wallet;
        this.name = name;
    }

    public Guest(String name, int wallet) {
        this.wallet = 100000;
        this.name = "Boss";
    }

    public Guest(String name) {
        this.name = name;
    }

    public Guest() {
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
