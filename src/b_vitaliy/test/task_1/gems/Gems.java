package b_vitaliy.test.task_1.gems;
/*

Камни должны иметь стоимость.

 */

public class Gems {
    String name;
    Integer cost;
    String color;
    Integer amoGems;
    String sellerLogin;

    public String getSellerLogin() {
        return sellerLogin;
    }

    public void setSellerLogin(String sellerLogin) {
        this.sellerLogin = sellerLogin;
    }

    public Gems() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Gems(Integer cost, Integer amoGems) {
        this.cost = cost;
        this.amoGems = amoGems;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public Integer getAmoGems() {
        return amoGems;
    }

    public void setAmoGems(Integer amoGems) {
        this.amoGems = amoGems;
    }

    public void addGems(Integer amoOfAddedGems){
        this.amoGems += amoOfAddedGems;
    }

    public void reduceGems(Integer amoOfReducedGems){
        this.amoGems -= amoOfReducedGems;
    }


    public void display(){
        System.out.println(name + ":" + "cost - " + cost + "; color - " + color + "; amount - "+ amoGems + ";");
    }

}
