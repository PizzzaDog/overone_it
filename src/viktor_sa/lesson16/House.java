package viktor_sa.lesson16;

public class House {
    private Door door;
    private String city;
    private Integer price;

    public House(Door door, String city, Integer price) {
        this.door = door;
        this.city = city;
        this.price = price;
    }

    public House() {

    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
