package m_katsko.hometask1;


import java.util.Random;

public class Comment {
    public static void main(String [] args){

        for(int i=1;i<21;i++){
            Random random=new Random(); //генерация случайных чисел
            int  ran=random.nextInt(25);
            if(ran>10) {
                if ((ran - 10)>=1 && (ran-10)<=4 ) System.out.println(ran + "**");
                else System.out.println(ran + "*");
            }
            else System.out.println(ran);
        }
    }
}
