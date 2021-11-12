package a_rogatko.lesson12;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
//        ArrayList<Integer> array = new ArrayList<>();
//        Integer a = new Integer(5);
//        array.add(a);
//        array.add(4);
//        array.add(4);
//        array.add(2,200);
//        array.remove(2);
//        int b = array.get(2);
//        array.add(b+1);
//        array.add(200);
//        for(int i : array){
//
//            System.out.println(i);
//        }
//        System.out.println("size: "+array.size());
//        System.out.println("содержит 200 - "+array.contains(200));
//
//
        ArrayList<Dog> dogs = new ArrayList<>();
        Dog dog1 = new Dog("Molly", 5);
        Dog dog2 = new Dog("Хрюндель", 4);
        Dog dog3 = new Dog("ahz", 3);
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        System.out.println(dog1.getName());
        dog1.setName("NoMolly");
        System.out.println(dog1.getName());
        dogs.remove(dog3);


        System.out.println("empty " + dogs.isEmpty());
        System.out.println(dogs.indexOf(dog3));
        dogs.stream().forEach(x -> System.out.print(x.getName() + " "));
        ArrayList<Dog> dogs1 = (ArrayList<Dog>) dogs.clone();
    }
}

