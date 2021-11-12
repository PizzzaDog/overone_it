package shukan_stanislaw.homework.lesson_12_homework.service;

import shukan_stanislaw.homework.lesson_12_homework.animals.Cat;
import shukan_stanislaw.homework.lesson_12_homework.animals.Dog;
import shukan_stanislaw.homework.lesson_12_homework.animals.Elephant;

public class AnimalService {
Cat cat = new Cat("Ryzhik",4,"white");
Dog dog = new Dog("Jere",3,"brown");
Elephant el = new Elephant("Jack",8);

 public void scream(Cat cat){
    System.out.println( cat.getName()+", "+ cat.getColor()+ ", " + cat.getAge());

}
 public void scream(Dog dog){
        System.out.println( dog.getName()+ ", " + dog.getAge()+ ", "+ dog.getEyesColor());

    }
    public void scream(Elephant el){
        System.out.println( el.getName()+", " + el.getAge());
}


}



