package shukan_stanislaw.lesson_14.Task1.gems;

public class Brilliants extends Gems{
    private int price;
    private int br;

    public Brilliants(int price) {
        super(price);
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }
    public void newPrice(){
        System.out.println(getPrice());
    }
}

