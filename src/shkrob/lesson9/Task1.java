package shkrob.lesson9;

public class Task1 {
    public static void main(String[] arg) {
        String[] stringTack1 = new String[]{"А", "Е", "Ё", "И", "О", "У", "Ы", "Э", "Ю", "Я"};
        for (String k : stringTack1) {
            System.out.println(k);
        }

        for (int i = 0; i < stringTack1.length; i += 2) {

                System.out.println(" " + stringTack1[i]);
            }

        }

    }



