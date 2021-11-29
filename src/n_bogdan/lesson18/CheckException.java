package n_bogdan.lesson18;

import n_bogdan.lesson10.racing.model.Car;
import n_bogdan.lesson11.Cat;
import n_bogdan.lesson11.Dog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckException {
    public static void main(String[] args) {
        Dog dog = new Dog("qwe", 1);
        Cat cat = new Cat();
        HashMap<String, Object> map = new HashMap<>();
        map.put("Вроде дабл", 1.2);
        map.put("Вроде инт", 100);
        System.out.println();



//        Double dooooble = (Double) map.get("Вроде инт");
//        System.out.println();
        List<Integer> listInt = new ArrayList<>();
        List<Double> listDouble = new ArrayList<>();

        //ВОТ ТАК ДЕЛАТЬ НЕЛЬЗЯ, НИКОГДА. :^)
        for (Map.Entry<String, Object> entry : map.entrySet()) {

            try {
                listInt.add((Integer) entry.getValue());
            } catch (ClassCastException e) {
            }

            try {
                listDouble.add((Double) entry.getValue());
            } catch (ClassCastException e) {

            }
        }

        System.out.println();
    }
}
