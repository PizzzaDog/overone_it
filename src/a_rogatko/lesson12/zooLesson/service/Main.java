package a_rogatko.lesson12.zooLesson.service;

import a_rogatko.lesson12.zooLesson.zoo.Animal;
import a_rogatko.lesson12.zooLesson.zoo.Camel;
import a_rogatko.lesson12.zooLesson.zoo.Cat;
import a_rogatko.lesson12.zooLesson.zoo.Dog;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Camel camel = new Camel("ccc",12);
        Cat cat = new Cat("Кот", 4);
        Dog dog = new Dog("Sobaka", 3);
        ArrayList<Animal> list = new ArrayList<>();
        list.add(camel);
        list.add(cat);
        list.add(dog);
        list.get(0).scream();

    }
}
