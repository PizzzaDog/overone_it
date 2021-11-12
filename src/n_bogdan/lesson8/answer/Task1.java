package n_bogdan.lesson8.answer;

public class Task1 {
    public static void main(String[] args) {
        String[] mass = new String[] {"a", "е", "ё", "и", "о", "у", "ы", "э", "ю", "я"};

        for (String a : mass) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int i = 0; i < mass.length; i += 2) {
            System.out.print(mass[i] + " ");
        }
    }
}
