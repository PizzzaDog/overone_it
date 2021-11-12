package o_glazdunova.Home11;

import o_glazdunova.Home11.zoo.Lion;
import o_glazdunova.Home11.zoo.Panda;
import o_glazdunova.Home11.zoo.Tiger;

import java.util.ArrayList;

public class AnimalService {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Good", 2, "Orance"); // хороший
        Lion lion = new Lion("Shaggy", 3, "Yellow"); // мохнатый
        Panda panda = new Panda("Cute", 1, "Black"); // милая

        ArrayList<Tiger> listTiger = new ArrayList<>();
        listTiger.add(tiger);

        ArrayList<Lion> listLion = new ArrayList<>();
        listLion.add(lion);

        ArrayList<Panda> listCamel = new ArrayList<>();
        listCamel.add(panda);

        AnimalService.scream(tiger);
        AnimalService.scream(lion);
        AnimalService.scream(panda);
    }

    private static void scream(Tiger tiger) {
        System.out.println(tiger.toString());
    }

    private static void scream(Lion lion) {
        System.out.println(lion.toString());
    }

    private static void scream(Panda panda) {
        System.out.println(panda.toString());
    }
}



////*1. Создать папку zoo, в ней создать минимум 3 класса разных животных с разными свойствами (полями) и
//// конструкторами
////2. Создать отдельный класс сервиса, в котором будет метод scream().
//// При вызове метода мы можем положить любое животное и он отработает



//////*public class Zoo {
    //public static void main(String[] args) {
       // AnimalService service = new AnimalService();

//        Эти строки должны отработать
//        service.scream(new Dog());
//        service.scream(new Cat());
//        service.scream(new Camel());







