package o_glazdunova.lesson7;

public class Main {
    public static void main(String[] args) {
        Human bob = new Human();
        Dog doggy = new Dog();
        doggy.name = "THE SHARIK 2.0";
        bob.name = "BOBBBBB";
        bob.dog = doggy;
        bob.speak();
        bob.dogWalk();
    }
}
