package b_vitaliy.lesson_8;

public class Task1 {
    public static void main(String[] args) {


        String[] mass = new String[]{"а", "е", "ё", "и", "о", "у", "ы", "э", "ю", "я"};

        System.out.println("Все глассные буквы");
        for (String a : mass) {
            System.out.println(a);
        }
        System.out.println("гласные буквы через одну");

        int b = 1;
        for (String a : mass) {
            if (b % 2 == 1) System.out.println(a);
            b++;
        }


    }
}
