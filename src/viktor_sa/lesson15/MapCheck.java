package viktor_sa.lesson15;

import java.util.HashMap;
import java.util.Map;

public class MapCheck {
    public static void main(String[] args) {
        Dog dog1 = new Dog("TsaTsa", 11);
        Dog dog2 = new Dog("Bobik", 11);

        Owner owner1 = new Owner("o1");
        Owner owner3 = new Owner("o3");


        Map<Owner, Dog> contest = new HashMap<>();

        contest.put(owner1,dog1);
        contest.put(owner3,dog2);

        System.out.println(contest.containsValue(dog2));

        Map<Dog,String> hashCodeCheck = new HashMap<>();
        hashCodeCheck.put(new Dog(), "check1");

    }
}
