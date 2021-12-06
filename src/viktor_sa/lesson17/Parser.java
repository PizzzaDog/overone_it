package viktor_sa.lesson17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Parser {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\savit\\Documents\\GitHub\\overone_it\\src\\viktor_sa\\lesson17\\word.txt");
        Scanner scanner = new Scanner(file);
        Map<String, Integer> salaries = new HashMap<>();

        List<String> lines = new ArrayList<>();

        while (scanner.hasNextLine()) {
            lines.add(scanner.next());

        }

        for (String line : lines) {
            String[] keyValue = line.split("-");
            salaries.put(keyValue[0],Integer.parseInt(keyValue[1]));
        }

        lines.forEach(System.out::println);

        String stroka = "Privat vsem";
        String[] arr = stroka.split(" ");
        Arrays.stream(arr).forEach(System.out::println);



    }
}
