package shukan_stanislaw.homework.lesson_12_homework;

import shukan_stanislaw.homework.lesson_12_homework.animals.Cat;
import shukan_stanislaw.homework.lesson_12_homework.animals.Dog;
import shukan_stanislaw.homework.lesson_12_homework.animals.Elephant;
//import shukan_stanislaw.homework.lesson_12_homework.service.AnimalService;

public class Zoo {


    public static void main(String[] args) {
        //AnimalService service = new AnimalService();
        Cat cat = new Cat("Ryzhik", 4, "white");
        Dog dog = new Dog("Jere", 3, "brown");
        Elephant el = new Elephant("Jack", 8);
        //service.scream(cat);
        //service.scream(dog);
       // service.scream(el);
        

    }
}
