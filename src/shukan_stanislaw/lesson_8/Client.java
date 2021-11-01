package shukan_stanislaw.lesson_8;
import java.util.Scanner;
public class Client {
    String name;
    Food order;
    Scanner sc = new Scanner(System.in);
    void speak(){
        System.out.println( "Я буду "+order.legs+" ножек");
    }
}//client[] zakaz = new Client{human 1,

