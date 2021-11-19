//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package al_rogatko.test15_11_2021;

import java.util.ArrayList;

public class DataOnly {
    public static ArrayList<Stone> marketList = new ArrayList();
    public static ArrayList<Stone> client1list = new ArrayList();
    public static ArrayList<Stone> client2list = new ArrayList();

    public DataOnly() {
    }

    static void lists() {
        marketList = generator(10);
        client1list = generator(3);
        client2list = generator(4);
    }

    private static ArrayList<Stone> generator(int i) {
        ArrayList<Stone> list = new ArrayList();

        for(int j = 0; j <= i; ++j) {
            String tempString = "";
            int tempInt = (int)(Math.random() * 3.0D) + 1;
            if (tempInt == 1) {
                tempString = "diamond";
            }

            if (tempInt == 2) {
                tempString = "topaz";
            }

            if (tempInt == 3) {
                tempString = "rubin";
            }

            Stone temp = new Stone(tempString, (int)(Math.random() * 10.0D + 15.0D), (int)(Math.random() * 20.0D + 10.0D));
            list.add(temp);
        }

        return list;
    }
}
