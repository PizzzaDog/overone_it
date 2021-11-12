package o_glazdunova.lesson9.rest;

public class Guest {
    private int wallet; //создали кошелек интовский для цифр
    private String name; // создали имя стринговое для теста

    //создаем конструктор для этих методов (Alt+Insert, потом выделяем Shift,если нужно 2 и более строки выбрать и ОК)

    public Guest(int wallet, String name) { //если сначала идет инт а потом стринга их нельзя менять местами, будут разные результаты
        this.wallet = wallet;
        this.name = name;
    }

    public Guest(String name, int wallet) { // специально создали такую же но поменяли местами стринг и инт
        this.wallet = 100000;
        this.name = "Boss";
    }

    public Guest(){ //создаем еще один конструктор такой же,но без параметров.
    }

    public Guest(String name) { // создали конструктор со стрингой
        this.name = name;
    }


    //создает методы get/set (Alt+Insert, потом выделяем Shift,если нужно 2 и более строки выбрать и ОК)


    public int getWallet() {
        return wallet;
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
