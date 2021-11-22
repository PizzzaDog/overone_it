package shukan_stanislaw.lesson_15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class MyMap {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        Map<String, Dog> myMapInInterface = new HashMap<>();
        Map<String, Dog> myMapInInterface2 = new LinkedHashMap<>();

        /**
         * Инициализация мапы
         * Все хранится в формате <Ключ, Значение>
         *
         */
        HashMap<String, Dog> myMap = new HashMap<>();
        //Создаем ключ
        String key = "Kek";

        Dog tsaTsa = new Dog("Tsa Tsa", 10);

        //Кладем пару ключ-значение в нашу мапу
        myMap.put(key, tsaTsa);

        //Достаем значение по ключу
        myMap.get(key).getName();

        System.out.println(myMap.get("Kek").getName());
        System.out.println(myMap.get(key).getName());


        Dog dogForReplace = new Dog("Ne Tsa Tsa", 5);

        /**
         * Замена элемента.
         * Указываем ключ, по которому мапа найдет пару, указываем значение,
         * которое положится вместо существующего
         */
        myMap.replace(key, dogForReplace);

        System.out.println(myMap.containsValue(tsaTsa));
        System.out.println(myMap.containsValue(dogForReplace));

        System.out.println(myMap.containsKey("Kek"));
        System.out.println(myMap.containsKey(key));

        // Достает все ключи, которые есть в мапе и складывает их в Set
        myMap.keySet();

        String key2 = "Kek2";

        myMap.put(key2, new Dog("Bob", 5)); // Размер мапы 2

        //Кладем в мапу ключ-значение, когда такой ключ уже существует
        myMap.put(key2, tsaTsa);
        System.out.println(myMap.get(key2).getName());

        String key3 = "Kek3";

        // Если заменить объект по ключу, которого не существует, ничего не произойдет
        myMap.replace(key3, new Dog("qwe", 1));

        System.out.println(myMap.get(key3));


        /** Как пройтись циклом по мапе
         * Entry - обертка, в которой хранится одна пара ключ-значение
         * Entry<Key, Value>
         * Можно взять ключ getKey() или значение getValue(). Можно заменить значение entry.setValue()
         */

        for (Map.Entry<String, Dog> entry : myMap.entrySet()) {
            if (entry.getKey().length() == 5){
                System.out.println(entry.getValue());
            }
        }
        // Достаем только по ключу. Неизвестно, какое там значение
        myMap.remove("qwe");

        // Достаем по ключу и значению
        myMap.remove("qwe", tsaTsa);


        //Достать по ключю. НО если по ключу ничего нет, достается "запасной" Dog
        System.out.println(myMap.getOrDefault(key, tsaTsa).getName());



//        String key2 = "Kek2";
//        String key3 = "Kek3";
//        Dog customDog = new Dog("Check Dog", 55);
//
//        myMap.put(key3, customDog);
//        System.out.println("qwe");
//        customDog.setName("After Change");
//        System.out.println("qwe");
    }
}
