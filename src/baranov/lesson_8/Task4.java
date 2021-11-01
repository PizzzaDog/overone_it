package baranov.lesson_8;

public class Task4 {
    public static void main(String[] args) {
        int a1 = 0, a2 = 1, amax = a1 + a2;
        System.out.print(a1 + ", " + a2);
        while(amax < 1000){
            System.out.print(", ");


                a2 = a1;
                a1 = amax;
                amax = a1 + a2;
            System.out.print(amax);
        }
    }
}
