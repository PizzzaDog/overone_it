package viktor_sa.lesson8;

public class Task1 {
    public static void main(String[] args) {
        String[] alfavit = new String[]{"а", "е", "ё", "и", "о", "у", "ы", "э", "ю", "я"};

        for (String k : alfavit) {
            System.out.println(k);
        }


        for (int i = 0; i < alfavit.length; i++) {
            if (i % 2 == 0) {
                System.out.println(" " + alfavit[i]);
            }
        }

    }
}
