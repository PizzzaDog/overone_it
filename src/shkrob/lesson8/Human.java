package shkrob.lesson8;

public class Human {
    String name;
    Integer age;
    Dog dog;
    void  speak() {
        System.out.println(name);
    }

    Dog dropTheDog() {
        return dog;
    }

}
