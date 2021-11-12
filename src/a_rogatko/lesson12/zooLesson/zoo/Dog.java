package a_rogatko.lesson12.zooLesson.zoo;

import java.awt.*;

public class Dog extends Animal{
    String name;
    int age;
    public Dog(String name, int age){
        this.name = name;
        this.age = age;

    }
    public void scream(){
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");


    }
}
