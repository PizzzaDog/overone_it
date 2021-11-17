package a_rogatko.leeson8;

public class Task4 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(0);

int i = 0;
        while(a+b<1000) {
i++;
            if (i % 2 == 0) {
                a = a + b;
                System.out.println(a);
            } else {
                b = a + b;
                System.out.println(b);
            }



        }

    }


}
