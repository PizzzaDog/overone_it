package viktor_sa.lesson11.zoo;

import java.util.ArrayList;

public class Tiger {
    private String name;
    private int age;
    private String color;

    public Tiger(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String toString() {
        return "name = " + name + ", age = " + age + ", color = " + color;
    }
}
