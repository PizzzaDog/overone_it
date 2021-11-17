package d_sergeev.homework1;

import java.util.Random;

public class sweet1 {
    public static void main(String[] strg) {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            Integer number = random.nextInt(20);
            if (number < 10) {
                System.out.println(number);
            } else if (number == 11 ){
                System.out.println(number + "");
            }
            else if (number == 12 ){
                System.out.println(number + "");
            }
            else if (number == 13 ){
                System.out.println(number + "");
            }
            else if (number == 14 ){
                System.out.println(number + "");
            } else
                System.out.println(number + "*");
        }
    }
}

