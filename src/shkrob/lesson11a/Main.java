package shkrob.lesson11a;

import java.util.ArrayList;

public class Main {
    public static void  main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        //Добовляем
        array.add(5);
        array.add(7);
        array.add(2, 10);
        array.add(2);

        //Удаленние элемента по индексу
        array.remove(1);

        System.out.println(array.size());

        array.
                array.get();


        for (int i : array) {
            System.out.println(i);
        }
        ArrayList<Dog> dogList = new ArrayList<>();
        Dog  dog1 = new Dog("Moll", 5);
        Dog dog2 = new Dog("TsaTsa", 4);
        Dog dog3 = new Dog("Foxy", 8);
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);

        System.out.println(dogList.contains(dog2));
        dogList.stream().forEach(x-> System.out.print(x.getName() + ""));
        System.out.println();

        System.out.println(dogList.remove(dog2));
        dogList.stream().forEach(x -> System.out.print(x.getName() +""));
        System.out.print(dogList.remove(dog2));

        dogList.contains(dog2);

        dogList.indexOf(dog2);

        dogList.set(1, dog2);

        dogList.get(10);
        System.out.println(dogList.get(dogList.size() - 1).getName());

        ArrayList<Dog> arrayNull;
        arrayNull.isEmpty();

        dogList

    }

}
