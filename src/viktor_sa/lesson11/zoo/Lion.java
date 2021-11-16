package viktor_sa.lesson11.zoo;

public class Lion {
    private String name;
    private int age;
    private String color;

    public Lion(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String toString() {
        return "name = " + name + ", age = " + age + ", color = " + color;
    }
}
