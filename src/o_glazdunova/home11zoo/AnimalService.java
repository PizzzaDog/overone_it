package o_glazdunova.home11zoo;

import java.util.ArrayList;

public class AnimalService {
    public static void main(String[] args) {
        o_glazdunova.home11zoo.Tiger tiger = new o_glazdunova.home11zoo.Tiger("Good", 2, "Orance"); // хороший
        o_glazdunova.home11zoo.Lion lion= new o_glazdunova.home11zoo.Lion("Shaggy", 3, "Yellow"); // мохнатый
        o_glazdunova.home11zoo.Panda panda = new o_glazdunova.home11zoo.Panda("Cute", 1, "Black"); // милая

        ArrayList<o_glazdunova.home11zoo.Tiger> listTiger = new ArrayList<>();
        listTiger.add(tiger);

        ArrayList<o_glazdunova.home11zoo.Lion> listLion = new ArrayList<>();
        listLion.add(lion);

        ArrayList<o_glazdunova.home11zoo.Panda> listCamel = new ArrayList<>();
        listCamel.add(panda);

        AnimalService.scream(tiger);
        AnimalService.scream(lion);
        AnimalService.scream(panda);
    }

    private static void scream(o_glazdunova.home11zoo.Tiger tiger) {
        System.out.println(tiger.toString());
    }

    private static void scream(o_glazdunova.home11zoo.Lion lion) {
        System.out.println(lion.toString());
    }

    private static void scream(o_glazdunova.home11zoo.Panda panda) {
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







