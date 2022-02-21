package shukan_stanislaw.lesson_6;

/**
 * Создать массив элементов типа String размером 4
 * Заполнить его словами
 * Пробежаться по массиву и вывести в консоль количество гласных букв в каждом слове
 * <p>
 * v2.0 Вывести в консоль длину каждого слова (количество букв)
 */
public class Task1 {
    public static void main(String[] args) {

        String[] slova = new String[]{"light", "Right", "Mama"};
      /*  for (String k : slova) {
            System.out.print(k.length());
        }*/
        for (String k : slova) {
            int cout = 0;
            for (int i = 0; i < k.length(); i++) {
                if (k.charAt(i) == 'a' || k.charAt(i) == 'e' || k.charAt(i) == 'i' || k.charAt(i) == 'o' || k.charAt(i) == 'u') {
                    cout++;
                }
            }
            System.out.println(k + cout);
        }

    }
}
