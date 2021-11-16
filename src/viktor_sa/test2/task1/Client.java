package viktor_sa.test2.task1;

public class Client {
    static String login;
    static String pass;
    static int wallet;
    static int countOfDiamondClient;
    static int countOfRubensClient;
    static int countOfSapphiresClient;

    public Client(String login, String pass, int wallet, int countOfDiamond, int countOfRubens, int countOfGolds) {
        Client.login = login;
        Client.pass = pass;
        Client.wallet = wallet;
        Client.countOfDiamondClient = countOfDiamond;
        Client.countOfRubensClient = countOfRubens;
        Client.countOfSapphiresClient = countOfGolds;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        Client.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        Client.pass = pass;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        Client.wallet = wallet;
    }

    public int getCountOfDiamond() {
        return countOfDiamondClient;
    }

    public void setCountOfDiamond(int countOfDiamond) {
        Client.countOfDiamondClient = countOfDiamond;
    }

    public int getCountOfRubens() {
        return countOfRubensClient;
    }

    public void setCountOfRubens(int countOfRubens) {
        Client.countOfRubensClient = countOfRubens;
    }

    public int getCountOfSapphires() {
        return countOfSapphiresClient;
    }

    public void setCountOfSapphires(int countOfSapphires) {
        Client.countOfSapphiresClient = countOfSapphires;
    }
}



