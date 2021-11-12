package b_vitaliy.lesson_6;

import java.lang.String;

public class Task1 {

    public static void main(String[] args) {

        String[] mass = new String[]{"страница", "матрица", "дом", "рама"};
        int k = 0;

        for (int i = 0; i < mass.length; i++) {
            System.out.println("слово " + mass[i]);
            System.out.println("длинна равна " + mass[i].length());
            System.out.println();
            char[] ch = mass[i].toCharArray();
            for (int j = 0; j < ch.length; j++) {
                switch (ch[j]) {
                    case 'а':
                        k++;
                        break;
                    case 'о':
                        k++;
                        break;
                    case 'и':
                        k++;
                        break;
                    case 'е':
                        k++;
                        break;
                    case 'ё':
                        k++;
                        break;
                    case 'э':
                        k++;
                        break;
                    case 'ы':
                        k++;
                        break;
                    case 'у':
                        k++;
                        break;
                    case 'ю':
                        k++;
                        break;
                    case 'я':
                        k++;
                        break;
                }

            }

        }
        System.out.println("количество гласных всего равно " + k);
    }

}
