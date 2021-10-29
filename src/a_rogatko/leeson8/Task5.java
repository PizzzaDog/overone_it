import java.util.Scanner;
public class Task5{

    public static void main(String[] args) {
        Run.start();
    }
}



class Run {

    static	int kr = 20;
    static	int n = 10;
    static	int k = 5;
    static	int clients = 0;
    static int maxClients = 5;

    static void start() {
        Data base = new Data();
        Scanner sc = new Scanner(System.in);
        while (kr + n + k > 0 && clients < maxClients) {
            System.out.println("Введите количество крылышек");
            int tempKr = sc.nextInt();
            System.out.println("Введите ко-во ножек");
            int tempN = sc.nextInt();
            System.out.println("Введите кол-во картошек ");
            int tempK = sc.nextInt();
            if (tempKr <= kr && tempN <= n && tempK <= k) {
                System.out.println("Ваше имя?");
                String name = sc.next();
                kr = kr - tempKr;
                n = n - tempN;
                k = k - tempK;
                base.setData(clients, name, tempKr, tempN, tempK);
                clients++;
            } else {
                start();
            }
        }
        PrintCard.printAll(base.names, base.kr, base.n, base.k);
    }
}
class Data {
    public	String[] names = new String[Run.maxClients];
    int[] kr = new int[Run.maxClients];
    int[] n = new int[Run.maxClients];
    int[] k = new int[Run.maxClients];
    public	void setData(int clients, String name, int kri, int nojek, int kart) {
        names[clients] = name;
        kr[clients] = kri;
        n[clients] = nojek;
        k[clients] = kart;
    }
}

class PrintCard {
    static	void printAll(String[] names, int[] kr, int[] nojek, int[] kart) {
        for (int i = 0; i < Run.clients; i++) {
            if (names[i] != null) {
                System.out.print("Клиент " + names[i] + " заказал " + kr[i] + " крылышек " + nojek[i] + " ножек " + kart[i] + " картошек");
                System.out.println();


            }
        }
    }
}
