package shukan_stanislaw.homework.lesson_12_homework.animals;

public class Dog {
    private String name;
    private int age;
    private String eyesColor;

    public Dog(String name, int age, String eyesColor) {
        this.name = name;
        this.age = age;
        this.eyesColor = eyesColor;
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

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }


}