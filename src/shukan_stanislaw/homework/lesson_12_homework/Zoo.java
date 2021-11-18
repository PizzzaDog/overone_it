package shukan_stanislaw.homework.lesson_12_homework;

import shukan_stanislaw.homework.lesson_12_homework.animals.Cat;
import shukan_stanislaw.homework.lesson_12_homework.animals.Dog;
import shukan_stanislaw.homework.lesson_12_homework.animals.Elephant;
import shukan_stanislaw.homework.lesson_12_homework.service.AnimalService;

public class Zoo {
    public static void main(String[] args) {
        Cat cat = new Cat("Ryzhyk",4,"white");
        Dog dog = new Dog("Jere",3,"brown");
        Elephant el = new Elephant("Jack",8);
        AnimalService service = new AnimalService();
        service.scream(cat);
        service.scream(dog);
        service.scream(el);
    }
}
