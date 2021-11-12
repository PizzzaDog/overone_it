package b_vitaliy.lesson11_homework.zoo;

public class Fish {
    String name;
    Integer age;
    String color;

    public Fish(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Fish(String name, Integer age) {
        this.name = name;
        this.age = age;
        setColor("Gold");
    }

    public Fish(String name) {
        this.name = name;
        setAge(1);
        setColor("Blue");
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
