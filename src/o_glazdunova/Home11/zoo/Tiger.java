package o_glazdunova.Home11.zoo;
import java.util.ArrayList;
public class Tiger {
    private String name;
    private int age;
    private String colour;

    public Tiger(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public String toString() {
        return "name = " + name + ", age = " + age + ", colour = " + colour;
    }
}
