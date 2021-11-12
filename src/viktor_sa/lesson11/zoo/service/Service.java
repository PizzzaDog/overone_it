package viktor_sa.lesson11.zoo.service;

import viktor_sa.lesson11.zoo.Camel;
import viktor_sa.lesson11.zoo.Lion;
import viktor_sa.lesson11.zoo.Tiger;

import java.util.ArrayList;

public class Service {
    public static void main(String[] args) {
        Lion lion = new Lion("Nuna", 8, "Green");
        Tiger tiger = new Tiger("Popa", 7, "White");
        Camel camel = new Camel("Iona", 15, 10);

        ArrayList<Tiger> listTiger = new ArrayList<>();
        listTiger.add(tiger);

        ArrayList<Lion> listLion = new ArrayList<>();
        listLion.add(lion);

        ArrayList<Camel> listCamel = new ArrayList<>();
        listCamel.add(camel);

        Service.scream(tiger);
        Service.scream(lion);
        Service.scream(camel);

    }

    private static void scream(Tiger tiger) {
        System.out.println(tiger.toString());
    }

    private static void scream(Lion lion) {
        System.out.println(lion.toString());
    }

    private static void scream(Camel camel) {
        System.out.println(camel.toString());
    }

}
