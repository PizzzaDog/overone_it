package a_rogatko.lesson12.zooLesson.zoo;

import java.awt.*;

public class Cat extends Animal{
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void scream() {
        System.out.println("!!!!!!!!!!!!!!!!!");
    }
}
