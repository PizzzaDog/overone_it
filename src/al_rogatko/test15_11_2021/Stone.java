package al_rogatko.test15_11_2021;



public class Stone {
    String type;
    int price;
    int size;

    public String getType() {
        return this.type;
    }

    public int getPrice() {
        return this.price;
    }

    public int getSize() {
        return this.size;
    }

    public Stone(String type, int price, int size) {
        this.type = type;
        this.price = price;
        this.size = size;
    }
}

