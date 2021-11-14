package viktor_sa.lesson11.zoo.service;

import viktor_sa.lesson11.zoo.Camel;
import viktor_sa.lesson11.zoo.Lion;
import viktor_sa.lesson11.zoo.Tiger;

import java.util.ArrayList;

public class Service {
    public static void main(String[] args) {
        Lion lion = new Lion("Nuna", "Arrr", "Green", 8);
        Tiger tiger = new Tiger("Popa", "May", "White", 15);
        Camel camel = new Camel("Iona", "Meyyy", "Orange", 7);

        System.out.println(lion.scream());
        System.out.println(tiger.scream());
        System.out.println(camel.scream());

    }
}
