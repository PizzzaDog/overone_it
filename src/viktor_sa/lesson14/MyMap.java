package viktor_sa.lesson14;

import java.util.*;

public class MyMap {
    public static void main(String[] args) {

        HashMap<String, Dog> myMap = new HashMap<>();
        String key = "Kek";
        Dog tsaTsa = new Dog("Tsa Tsa", 10);
        myMap.put(key, tsaTsa);

        System.out.println(myMap.get(key).getName());

        Dog dogForReplace = new Dog("Ne Tsa Tsa", 200);
        myMap.replace(key,dogForReplace);

        System.out.println(myMap.containsValue(dogForReplace));

        System.out.println(myMap.containsKey("Kek"));

       String key2 = "Kek2";

       myMap.put(key2,new Dog("Bob", 5));

       myMap.put(key,tsaTsa);

       for(Map.Entry<String, Dog> entry : myMap.entrySet()) {
           entry.getValue();
       }

       



    }
}
