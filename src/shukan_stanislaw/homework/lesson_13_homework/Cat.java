package shukan_stanislaw.homework.lesson_13_homework;

public class Cat extends AnimalService {
    //Cat cat = new Cat("Jere", 13, "Brown");
    private String name;
    private int age;
    private String colorOfEyes;


    public Cat(String name, int age, String colorOfEyes) {
        this.name = name;
        this.age = age;
        this.colorOfEyes = colorOfEyes;
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

    public String getColorOfEyes() {
        return colorOfEyes;
    }

    public void setColorOfEyes(String colorOfEyes) {
        this.colorOfEyes = colorOfEyes;
    }

    public void scream() {
        System.out.println(getName()+", " + getAge()+", " +getColorOfEyes() );
    }


}
