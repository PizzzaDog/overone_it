package a_rogatko.lesson3;
import java.util.Scanner;
import java.util.Random;
public class RedAndBlack {
    public static void main(String[] args) {
        int wallet = 100;
        int bet = 0;
        int choice;
        int result;
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        while(wallet > 0&& wallet<200){
            System.out.println("Ваша ставка -?");
            bet = sc.nextInt();
            if(bet>wallet){
                System.out.println("no money");
                break;
            }
            System.out.println("stavka 0 or 1");
           choice= sc.nextInt();
           result = r.nextInt(2);
           if(choice==result){wallet+=bet;
               System.out.println("you win "+"you wallet "+wallet);
               System.out.println("");}else{
               wallet-=bet;
               System.out.println("you lose");
           }




            
            
            
        }
    }
}
