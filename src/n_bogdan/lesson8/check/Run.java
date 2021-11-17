package n_bogdan.lesson8.check;

import java.util.Scanner;

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
