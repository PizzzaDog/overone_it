package viktor_sa.lesson7;

public class Main {
    public static void main(String[] args) {
        Human bob = new Human();
        Dog doggy = new Dog();
        doggy.name = "THE SHARIK 2.0";


        bob.name = "BOOB";
        bob.dgt = doggy;
        bob.speak();
        bob.dropTheDog();
    }
}
