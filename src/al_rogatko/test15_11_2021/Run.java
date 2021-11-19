//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package al_rogatko.test15_11_2021;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public Run() {
    }

    public static void run() {
        Action ac = new Action();
        DataOnly.lists();
        Client client1 = new Client(1000, DataOnly.client1list, 1);
        Client client2 = new Client(750, DataOnly.client2list, 2);
        ArrayList<Client> clients = new ArrayList();
        clients.add(client1);
        clients.add(client2);
        Market market = new Market(5000, DataOnly.marketList);

        System.out.println("Input  client id");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        for (int i = 0; i < clients.size(); ++i) {
            if (id == ((Client) clients.get(i)).id) {
                Client temp = (Client) clients.get(i);
                printResult(temp, market);
                System.out.println();
                ac.action(temp, market);
                printResult(temp, market);


            }
        }


    }

    static void printResult(Client client, Market market) {
        System.out.println("Money " + client.getMoney());
        System.out.println("Jewels " + client.getList().size());

        for (int j = 0; j < client.getList().size(); ++j) {
            System.out.print(((Stone) client.getList().get(j)).getType() + ", " + ((Stone) client.getList().get(j)).getPrice() + " $ ; ");
        }
        System.out.println();
        System.out.println("Market money: " + market.getMoney());
        for (int k = 0; k < market.list.size(); k++) {
            System.out.print("Jewel " + market.list.get(k).type + " " + market.list.get(k).price + " $ ;");


        }


    }
}
