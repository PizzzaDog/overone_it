package viktor_sa.test2.task1;

public class Client {
    String login;
    String pass;
    int wallet;
    int countOfDiamondClient;
    int countOfRubensClient;
    int countOfSapphiresClient;

    public Client(String login, String pass, int wallet, int countOfDiamond, int countOfRubens, int countOfGolds) {
        this.login = login;
        this.pass = pass;
        this.wallet = wallet;
        this.countOfDiamondClient = countOfDiamond;
        this.countOfRubensClient = countOfRubens;
        this.countOfSapphiresClient = countOfGolds;
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
        return countOfDiamondClient;
    }

    public void setCountOfDiamond(int countOfDiamond) {
        this.countOfDiamondClient = countOfDiamond;
    }

    public int getCountOfRubens() {
        return countOfRubensClient;
    }

    public void setCountOfRubens(int countOfRubens) {
        this.countOfRubensClient = countOfRubens;
    }

    public int getCountOfSapphires() {
        return countOfSapphiresClient;
    }

    public void setCountOfSapphires(int countOfSapphires) {
        this.countOfSapphiresClient = countOfSapphires;
    }
}



