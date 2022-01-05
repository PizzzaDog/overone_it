//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package al_rogatko.test15_11_2021;

import java.util.ArrayList;

public class Client extends Store {
    int id;

    public int getId() {
        return this.id;
    }

    public Client(int money, ArrayList<Stone> list, int id) {
        super(money, list);
        this.id = id;
    }
}
