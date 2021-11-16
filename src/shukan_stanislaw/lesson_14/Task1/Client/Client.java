package shukan_stanislaw.lesson_14.Task1.Client;

import shukan_stanislaw.lesson_14.Task1.gems.Brilliants;
import shukan_stanislaw.lesson_14.Task1.gems.Gems;
import shukan_stanislaw.lesson_14.Task1.gems.Rubies;

public class Client {
    private int login;
    private int wallet;
    private int br;
    private int rub;
    private String name;



    public Client(int login, String name,int wallet, int br, int rub) {
        this.login = login;
        this.wallet = wallet;
        this.br = br;
        this.rub = rub;
        this.name = name;
    }

    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public int getBr() {
        return br;
    }

    public void setBr(int br) {
        this.br = br;
    }

    public int getRub() {
        return rub;
    }

    public void setRub(int rub) {
        this.rub = rub;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}