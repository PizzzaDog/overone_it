package viktor_sa.lesson6;

public class Task1 {
    public static void main(String[] args) {
        String[] strArray = new String[] {"cat", "dog", "fish", "cow"};
        for (String k : strArray) {
            System.out.println(k);
            System.out.println("Колличество букв в слове: " + k.length());
            int count = 0;

                for (int i = 0; i < k.length(); i++) {
                    if (k.charAt(i) == 'a' || k.charAt(i) == 'e' || k.charAt(i) == 'i'  || k.charAt(i) == 'o' || k.charAt(i) == 'u')  {
                        count++;
                    }
                }
            System.out.println("Количество гласных равно: " + count);
            }
        }
    }
