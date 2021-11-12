package n_bogdan.lesson11;

import n_bogdan.lesson9.Human;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> array = new ArrayList<>(); // {5, 10, 7, 2}
//
//        //Добавляем элемент в ArrayList
//        array.add(5); // {5}
//        array.add(7); // {5, 7}
//        array.add(1, 10); // {5, 10, 7}
//        array.add(2); // {5, 10, 7, 2}
//
//
//        //Достать элемент по индексу не удаляя его
//        array.get(1);
//
//        //Удаление элемента по индексу
//        array.remove(1);
//
//        //Количество заполненных ячеек листа
//        System.out.println(array.size());
//
//        for (int i : array) {
//            System.out.println(i);
//        }




        ArrayList<Dog> dogList = new ArrayList<>();
        Dog dog1 = new Dog("Molly", 5);
        Dog dog2 = new Dog("TsaTsa", 4);
        Dog dog3 = new Dog("Foxy", 8);
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);

        //Проверить наличие объекта в листе @return boolean
        System.out.println(dogList.contains(dog2));
        dogList.stream().forEach(x -> System.out.print(x.getName() + " "));
        System.out.println();


        //Достаем по ссылке на объект
        System.out.println(dogList.remove(dog2));
        dogList.stream().forEach(x -> System.out.print(x.getName() + " "));
        System.out.println();

        System.out.println(dogList.remove(dog2));

        dogList.add(dog2);
        dogList.add(dog2);
        dogList.stream().forEach(x -> System.out.print(x.getName() + " "));
        System.out.println();

        /**
         * ArrayList может хранить неограниченное кол-во одинаковых элементов (ссылок на них)
         * Удаляем опо ссылке.
         * @return boolean
         */
        System.out.println(dogList.remove(dog2));
        dog2.setName("Dog 2 remastered");
        System.out.println(dogList.remove(dog2));
        // dog2 закончились
        System.out.println(dogList.remove(dog2));

        // Проверяет наличие элемента без его удаления @return boolean
        dogList.contains(dog2);

        // Индекс объекта
        dogList.indexOf(dog2);

        // Замена объекта по индексу
        dogList.set(1, dog2);

        //
//        dogList.get(10);
        System.out.println(dogList.get(dogList.size() - 1).getName());

        // Позволяет узнать, пустой ли лист @return boolean
        dogList.isEmpty();

        // NullPointerException наш лист не инициализирован
//        ArrayList<Dog> arrayNull;
//        arrayNull.isEmpty();

        ArrayList<Dog> dogsToAdd = new ArrayList<>();
        dogsToAdd.add(new Dog("qwe", 1));
        dogsToAdd.add(new Dog("qwerr", 2));
        dogList.addAll(dogsToAdd);


    }
}
