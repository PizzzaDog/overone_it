package viktor_sa.lesson7;

public class Human {
    String name;
    Integer age;
    Dog dgt;

    void speak() {
        System.out.println(this.name);
    }

    Dog dropTheDog() {
        return null;
    }

    void dogWalk() {
        System.out.println("Я выгуливаю свою собаку по имени " + Dog.name);
    }
}
