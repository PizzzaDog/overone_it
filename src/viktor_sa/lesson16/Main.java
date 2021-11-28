package viktor_sa.lesson16;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        House house1 = new House(new Door(100, 200), "Minsk", 100000);
        House house2 = new House(new Door(100, 200), "Minsk", 100000000);
        House house3 = new House(new Door(200, 200), "Minsk", 100000);
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

        List<House> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCity().equals("Minsk")) {
                list.get(i).setPrice(list.get(i).getPrice() * 12 / 10);
                result.add(list.get(i));
            }
        }


        list.stream().filter(house -> house.getCity().equals("Minsk")).forEach(house -> house.setPrice(house.getPrice() * 12 / 10));
        list.stream().forEach(x -> System.out.println(x.getPrice() + " " + x.getCity()));


    }
}
