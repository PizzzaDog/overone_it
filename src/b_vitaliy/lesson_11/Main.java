package b_vitaliy.lesson_11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();//коллекция

        array.add(5);
        array.add(7);
        array.add(1,10);
        array.add(2);

        System.out.println("array.remove(): " + array.remove(1));//удаляет 10ку и возвращает ее
        System.out.println("Размер: " + array.size());
//        array.contains();

        for(int i: array){
            System.out.println(i);
        }

        ArrayList<Dog> dogList = new ArrayList<>();
        Dog dog1 = new Dog("Molly", 5);
        Dog dog2 = new Dog("TsaTsa", 4);
        Dog dog3 = new Dog("Foxy", 8);
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);


        System.out.println("does it contains dog2: " + (dogList.contains(dog2)));
        for(Dog dog: dogList){
            System.out.println(dog.getName() + " " + dog.getAge() + " " + dog.getClass());
        }
//реализация через stream
        System.out.println();
        dogList.stream().forEach(x -> System.out.println(x.getName() + " " + x.getAge() + " " + x.getClass()));
        System.out.println();

        //dogList.remove(dog2);
        dogList.remove(1);
        System.out.println(dogList.remove(dog2));
        dogList.stream().forEach(x -> System.out.println(x.getName() + " " + x.getAge() + " " + x.getClass()));

        System.out.println();

        //System.out.println(dogList.remove(dog2));

        dogList.add(dog2);
        dogList.add(dog2);
        System.out.println(dogList.remove(dog2));
        dog2.setName("dog2 nameRemastered");
        System.out.println(dogList.remove(dog2));
        System.out.println(dogList.remove(dog2));

        dogList.indexOf(dog2);
        dogList.set(1, dog2);

        for(Dog dog: dogList){
            System.out.println(dog.getName() + " " + dog.getAge() + " " + dog.getClass());
        }

        //dogList.get(10);
        System.out.println(dogList.get(dogList.size() - 1).getName());
//
//        ArrayList<Dog> arrayNull;
//        arrayNull.isEmpty();
//
        System.out.println();
        ArrayList<Dog> dogsToAdd = new ArrayList<>();
        dogsToAdd.add(new Dog("qwe", 1));
        dogsToAdd.add(new Dog("aqwer", 2));
        dogList.addAll(dogsToAdd);

        for(Dog dog: dogList){
            System.out.println(dog.getName() + " " + dog.getAge() + " " + dog.getClass());
        }
    }

}
