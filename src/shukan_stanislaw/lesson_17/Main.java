package shukan_stanislaw.lesson_17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
   House house1 = new House(new Door(100,200),"Minsk",100010);
        House house2 = new House(new Door(100,200),"Minsk",1000000);
        House house3 = new House(new Door(100,200),"Minsk",1000230);
        House house4 = new House(new Door(100,200),"Moscow",10053200);
        House house5 = new House(new Door(100,200),"Katowice",10053200);
        House house6 = new House(new Door(100,200),"Kiev",10053200);
        List<House> list = new ArrayList<>();
        list.add(house1);
        list.add(house2);
        list.add(house3);
        list.add(house4);
        list.add(house5);
        list.add(house6);
        List <House> result = new ArrayList<>();
        List<House> house = new ArrayList<>();
        for(int i =0;i<list.size();i++){
            if(list.get(i).getCity().equals("Minsk")){
                result.add(list.get(i));
                result.get(i).setPrice(result.get(i).getPrice()*12/10);
            }
        }


       result.stream().forEach(x-> System.out.println(x.getPrice()+ " "  + x.getCity()));
        IntStream.of(100,200,300,400).flatMap(x->IntStream.of(x)).forEach(x-> System.out.println(x));


        list.stream().filter(x->x.getCity().equals("Minsk")).forEach(x->x.setPrice(x.getPrice()*12/10));
       result.forEach(x-> System.out.println(x.getPrice()+ " " + x.getCity()));
       IntStream.of(100,200,300,400).flatMap(x->IntStream.of(x-50,x)).forEach(System.out::println);

    }

}
