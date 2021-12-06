package viktor_sa.lesson11.zoo;

public class Camel implements Animals {
    private String name;
    private String scream;
    private String color;
    private int age;

    public Camel(String name, String scream, String color, int age) {
        this.name = name;
        this.scream = scream;
        this.color = color;
        this.age = age;
    }

    public String name() {
        return name;
    }

    public String scream() {
        return scream;
    }

    public String color() {
        return color;
    }

    public int age() {
        return age;
    }

}
