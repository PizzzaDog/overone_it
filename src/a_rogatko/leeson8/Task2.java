package a_rogatko.leeson8;



public class Task2 {
    public static void main(String[] args) {
        int a = 2;
        int b =0;
        for(int i= 0; i<10;i++){
            b = (a*a)-1;
            System.out.println(a+" * "+a+" - 1 "+" = "+b);
            a=b;

        }
    }
}

