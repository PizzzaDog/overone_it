package viktor_sa.lesson15;

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

        contest.put(owner1,dog1);
//        contest.put(owner2,dog2);
        contest.put(owner3,dog2);

        System.out.println(contest.containsValue(dog2));

        Map<Dog,String> hashCodeCheck = new HashMap<>();
        hashCodeCheck.put(new Dog(), "check1");

    }
}
