package baranov.lessson_7;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Human bob = new Human();
        bob.name = "BOBBBB";
        Dog doggy = new Dog();

        doggy.name =  "THE SHARIK 2.0";

        bob.dog = doggy;

        bob.speak();

        bob.dogWalk();
    }
}
