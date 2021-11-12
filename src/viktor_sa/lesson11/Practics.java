package viktor_sa.lesson11;

import java.util.ArrayList;

public class Practics {
    public static void main(String[] args) {
//        ArrayList<Integer> array = new ArrayList<>();
//
//        array.add(5);
//        array.add(7);
//        array.add(1,10);
//        array.add(2);
//
//        array.remove(1);
//
//        System.out.println(" " + array.size());
//
//
//        for (int i : array) {
//            System.out.println(i);
//        }


        ArrayList<Dog>  dogList = new ArrayList<>();
        Dog dog1 = new Dog("Molly", 5);
        Dog dog2 = new Dog("TsaTsa", 4);
        Dog dog3 = new Dog("Foxy", 8);
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);

        System.out.println(dogList.contains(dog2));
        dogList.stream().forEach(x -> System.out.print(x.getName() + " "));
       System.out.println();

//        dogList.remove(dog2);
//        dogList.stream().forEach(x -> System.out.print(x.getName() + " "));
//        System.out.println();
//
//        System.out.println(dogList.remove(dog2));

//        dogList.set(1, dog2);
//
//        System.out.println(dogList.isEmpty());

        



    }
}
