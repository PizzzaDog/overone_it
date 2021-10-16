package shukan_stanislaw.lesson_3.homework;
import java.util.Random;


public class Task1_stanislaw {
    public static void main(String[] args) {
        int ars,i;
        for(ars=0;ars<20;ars++){
            Random random = new Random();
            i=random.nextInt(21);
            if(i>10){
                System.out.println(i+"*");
            }
            else{
                System.out.println(i);
            }




        }
    }

}
