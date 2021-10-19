package m_katsko.hometask1;

import java.util.Scanner;

public class Hometask_3 {
    public static void main(String[] args) {
        Integer pass1=1545, pass2=4514;
        Integer parin;
        Scanner par=new Scanner((System.in));
        System.out.println("Привет! ВВели, пожалуйста, пароль ");
        parin=par.nextInt();
        if(parin.toString().length()!=4) System.out.println("Error");
        else switch (parin){
            case 1545: System.out.println("Hello"); break;
            case 4514: System.out.println("Hello, change yor password"); break;
            default: System.out.println("Error");
        }
    }

}
