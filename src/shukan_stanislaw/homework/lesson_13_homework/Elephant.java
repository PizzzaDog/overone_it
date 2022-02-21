package shukan_stanislaw.homework.lesson_13_homework;

public class Elephant extends AnimalService {
    private String name;
    private int age;

    public Elephant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void scream() {
        System.out.println(getName() + ", " + getAge());
    }
}
