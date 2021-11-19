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
        DataCreator.lists();
        Client client1 = new Client(1000, DataCreator.client1list, 1);
        Client client2 = new Client(750, DataCreator.client2list, 2);
        ArrayList<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);
        Market market = new Market(5000, DataCreator.marketList);

        System.out.println("Input  client id");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        for (int i = 0; i < clients.size(); ++i) {
            if (id == clients.get(i).id) {
                Client temp = clients.get(i);
                printResult(temp, market);
                System.out.println();
                ac.action(temp, market);
                printResult(temp, market);


            }
        }


    }

    static void printResult(Client client, Market market) {
        System.out.println("Client ID : " + client.id);
        System.out.println("Money " + client.getMoney());
        System.out.println("Jewels " + client.getList().size());

        for (int j = 0; j < client.getList().size(); ++j) {
            System.out.print(client.getList().get(j).getType() + ", " + client.getList().get(j).getPrice() + " $ ; ");
        }
        System.out.println();

        System.out.println("Market money: " + market.getMoney() + " jewels : "+market.list.size());
        for (int k = 0; k < market.list.size(); k++) {
            System.out.print("Jewel " + market.list.get(k).type + " " + market.list.get(k).price + " $ ;");


        }


    }
}
