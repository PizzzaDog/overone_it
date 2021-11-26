package n_bogdan.lesson17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Parser {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Work\\overone_it\\src\\n_bogdan\\lesson17\\words.txt");
        Scanner sc = new Scanner(file);

        int[] asd = new int[] {1,2,3,4,5,6,7,8,9};

        List<String> lines = new ArrayList<>();

        Map<String, Integer> salaries = new HashMap<>();

        //Прочитать строки файла и добавить в List
        while (sc.hasNextLine()) {
            lines.add(sc.next());
        }


//        String stroka = "Privet menya zovut java";
//        String[] arr = stroka.split(" ");


        //Пробегаем по List строк, разделяем их на 2 строки и добавляем в Map в формате <Key, Value>
        for (String line : lines) {
            String[] keyValue = line.split("-");

            salaries.put(keyValue[0], Integer.valueOf(keyValue[1]));

            System.out.println(keyValue[0]);
        }

        System.out.println();

        //Одно и то же
//        words.stream().forEach(x -> System.out.println(x));

        lines.stream().forEach(System.out::println);


        //TODO ФИНАЛЬНЫЙ ВИД HASHMAP

        Map<String, SalaryPlan> result;



    }
}
