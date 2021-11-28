package n_bogdan.lesson16;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        House house1 = new House(new Door(100, 200), "Minsk", 10000);
        House house2 = new House(new Door(100, 200), "Minsk", 1000000);
        House house3 = new House(new Door(200, 200), "Minsk", 10000);
        House house4 = new House(new Door(100, 200), "Moscow", 100000);
        House house5 = new House(new Door(100, 200), "Kiev", 100000);
        House house6 = new House(new Door(100, 200), "Warsaw", 100000);

        List<House> list = new ArrayList<>();
        list.add(house1);
        list.add(house2);
        list.add(house3);
        list.add(house4);
        list.add(house5);
        list.add(house6);

        List<House> result1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCity().equals("Minsk")) {
                list.get(i).setPrice(list.get(i).getPrice() * 12 / 10);
                result1.add(list.get(i));
            }
        }

        System.out.println("qwe");
        result1.stream().forEach(x -> System.out.println(x.getPrice() + " " + x.getCity()));


        // Фильтруем стрим на соответствие условию, а потом меняем цену каждому элементу, который остался в СТРИМЕ
        list.stream().filter(house -> house.getCity().equals("Minsk")).forEach(house -> house.setPrice(house.getPrice() * 12 / 10));
        List<Integer> costs = list.stream().filter(house -> house.getCity().equals("Minsk")).map(house -> house.getPrice()).collect(Collectors.toList());

        // .reduce() Оля
        // .flatMap() Станислав
        // .groupingBy() Маша Кацко

        System.out.println("qwe");
        result1.forEach(x -> System.out.println(x.getPrice() + " " + x.getCity()));














    }
}
