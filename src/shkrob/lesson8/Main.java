package shkrob.lesson8;

public class Main {
    public  static void main(String[] arg) {
        Human bob = new Human();
        Dog doggy = new Dog();
        doggy.name = "THE SHARIK 2.0";

        bob.name = "BOBBBBBB";
        bob.dog = doggy;
        bob.speak();
        bob.dogWaljk();
    }
}
