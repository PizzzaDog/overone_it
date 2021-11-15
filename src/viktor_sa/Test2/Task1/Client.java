package viktor_sa.Test2.Task1;

public class Client {
    static String login;
    String pass;
    int wallet;
    int countOfDiamond;
    int countOfRubens;
    int countOfGolds;

    public Client(String login, String pass, int wallet, int countOfDiamond, int countOfRubens, int countOfGolds) {
        this.login = login;
        this.pass = pass;
        this.wallet = wallet;
        this.countOfDiamond = countOfDiamond;
        this.countOfRubens = countOfRubens;
        this.countOfGolds = countOfGolds;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public int getCountOfDiamond() {
        return countOfDiamond;
    }

    public void setCountOfDiamond(int countOfDiamond) {
        this.countOfDiamond = countOfDiamond;
    }

    public int getCountOfRubens() {
        return countOfRubens;
    }

    public void setCountOfRubens(int countOfRubens) {
        this.countOfRubens = countOfRubens;
    }

    public int getCountOfGolds() {
        return countOfGolds;
    }

    public void setCountOfGolds(int countOfGolds) {
        this.countOfGolds = countOfGolds;
    }
}



