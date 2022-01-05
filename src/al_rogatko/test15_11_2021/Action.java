package al_rogatko.test15_11_2021;

import java.util.Scanner;

public class Action {
    Scanner scanner = new Scanner(System.in);
    boolean s = false;

    void action(Client x, Market y) {
        System.out.println("1 buy, 2 sell, 3 exchange - ?");
        int i = scanner.nextInt();
        if (i == 1) buy(x, y);
        if (i == 2) sell(x, y);
        if (i == 3) exchange(x, y);


    }

    void buy(Store x, Store y) {
        if (!s) System.out.println("Input position for buy");
        int i = scanner.nextInt() - 1;
        x.setMoney(x.getMoney() - y.list.get(i).price);
        y.setMoney(y.getMoney() + y.list.get(i).price);
        x.list.add(y.list.get(i));
        y.list.remove(i);


    }

    void sell(Store x, Store y) {
        System.out.println("Input position for sell");
        s = true;
        buy(y, x);


    }

    void exchange(Store x, Store y) {
        System.out.println("Input positions for exchange ");
        int a = scanner.nextInt() - 1;
        int b = scanner.nextInt() - 1;
        int different = x.list.get(a).getPrice() - y.list.get(b).getPrice();
        x.setMoney(x.getMoney() + different);
        y.setMoney(y.getMoney() - different);
        x.list.add(y.list.get(b));
        y.list.add(x.list.get(a));
        y.list.remove(b);
        x.list.remove(a);


    }
}
