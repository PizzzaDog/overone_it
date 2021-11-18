package shukan_stanislaw.lesson_14.Task1.gems;

public class Gems {
    private int price;

    public Gems(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void newPrice(){
        System.out.println(getPrice());
    }

}
