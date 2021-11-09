package viktor_sa.lesson11.zoo;

public class Camel {
    private String name;
    private int age;
    private int length;

    public Camel(String name, int age, int length) {
        this.name = name;
        this.age = age;
        this.length = length;
    }

    public String toString() {
        return "name = " + name + ", age = " + age + ", lenght = " + length;
    }

}
