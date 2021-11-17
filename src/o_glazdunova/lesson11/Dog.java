package o_glazdunova.lesson11;

public class Dog {
    private String name; // создаем собаку с именем. Это поле
    private int age; // и возрастом               и Это поле

    public Dog(String name, int age) { //создаем конструктор
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    // создаем get /set

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
