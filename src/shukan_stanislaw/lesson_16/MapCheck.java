package shukan_stanislaw.lesson_16;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapCheck {
    public static void main(String[] args) {
        Dog dog1 = new Dog("TsaTsa", 11);
        Dog dog2 = new Dog("Bobik", 11);
        Dog dog3 = new Dog("Bobik", 15);

        Owner owner1 = new Owner("o1");
        Owner owner2 = new Owner("o2");
        Owner owner3 = new Owner("o3");

        Map<Owner, Dog> contest = new HashMap<>();

        contest.put(owner1, dog1);
        contest.put(owner3, dog3);

        // Потому что Dog.equals() мы сделали плохой, не надо так
//    System.out.println(contest.containsValue(dog2));


        Map<Dog, String> hashCodeCheck = new HashMap<>();

        //Тут будет невесело
//        hashCodeCheck.put(new Dog(), "check1");
//        hashCodeCheck.put(new Dog(), "check2");
//        hashCodeCheck.put(new Dog(), "check3");
//        hashCodeCheck.put(new Dog(), "check4");
//        hashCodeCheck.put(new Dog(), "check5");

        Dog dog11 = new Dog("dog1");
        Dog dog22 = new Dog("dog2");
        Dog dog33 = new Dog("dog3");


        hashCodeCheck.put(dog11, "check1");
        hashCodeCheck.put(dog22, "check2");
        hashCodeCheck.put(dog33, "check3");

        System.out.println(hashCodeCheck.size());

        hashCodeCheck.put(new Dog(), "qwfdsfwe");
        hashCodeCheck.put(new Dog(), "sadqffwe2");
        hashCodeCheck.put(new Dog(), "qwssae3");
        hashCodeCheck.put(new Dog(), "qwe55");
        hashCodeCheck.put(new Dog(), "qwe7");
        hashCodeCheck.put(new Dog(), "qwedfsg");
        hashCodeCheck.put(new Dog(), "qwecxzvc");
        hashCodeCheck.put(new Dog(), "qweqd");

        for (Map.Entry<Dog, String> entry : hashCodeCheck.entrySet()) {
            if(entry.getValue().contains("qwe")) {
                System.out.print(entry.getKey() + " ");
            }
        }
        Collection<String> values = hashCodeCheck.values();


        hashCodeCheck.values().stream().filter(s -> s.contains("qwe")).forEach(System.out::println);

//        System.out.println(hashCodeCheck.size());
    }
}