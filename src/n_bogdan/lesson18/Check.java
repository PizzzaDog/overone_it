package n_bogdan.lesson18;

import java.util.ArrayList;
import java.util.List;

public class Check {
    public static void main(String[] args) {
        List list = new ArrayList();
        try {
            list.get(2);
        } finally {
            System.out.println("qqqq");
        }
        System.out.println("qweee");
    }
}
