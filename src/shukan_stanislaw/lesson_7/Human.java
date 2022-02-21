package shukan_stanislaw.lesson_7;

public class Human {
    String name;
    Integer age;
    Dog dog;

    void speak() {
        System.out.println(name);
    }

    Dog dropTheDog() {
        return dog;
    }

    void dogWalk() {
        System.out.println("Я выгуливаю свою собаку по имени " + dog.name);
    }

}
