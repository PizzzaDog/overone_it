package shukan_stanislaw.lesson_18;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Parser {
    public static void main(String[] args) throws FileNotFoundException {
File file = new File("C:\\Users\\Stanislaw\\IdeaProjects\\overone_it\\src\\shukan_stanislaw\\lesson_18\\words.txt");
Scanner sc = new Scanner(file);
List<String> lines= new ArrayList<>();

Map<String,Integer> salaries = new HashMap<>();
        while(sc.hasNext()) {
            lines.add(sc.next());
        }
        for(String line : lines){
  String[] keyValue =  line.split("-");
    salaries.put(keyValue[0],Integer.parseInt(keyValue[1]));
    System.out.println(keyValue[0]+ " - " + keyValue[1]);

}
        lines.stream().forEach(System.out::println);


    }
}

