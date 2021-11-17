package o_glazdunova.lesson11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(); //таким образом инициализируем (создаем) ArrayList

        //МЕТОДЫ(ствим. и выбираем метод) ArrayList

               /* 1. методом add мы ДОБАВЛЯЕМ  элемент в ArrayList

        * ArrayList у нас типа Integer (а может быть любого типа) значит вводим цифры
        *рассмотрим в какой последовательности выводятся добавленные элементы
        *создадим специально несколько значений (элементов 5,7,10,2) и они так и выведутся в консоль
        * но если мы зададим индекс (как в 3 строке),то индекс(-это место в ArrayList, так же как в массиве
        * от 0 и далее, то индекс выведит число 10, вторым (так как идет сначала 0= он у нас =5,
        * потом 1 = мы ее задали 10. и остальные элементы сдвигаются вправо.
        * то есть в консоль выведится так: 5,10,7,2 а было 5,7,10,2

                */
       array.add(5); //добавлять будет так 5
       array.add(7); // 5,7
        array.add(1, 10); //5,10,7
        array.add(2); // 5,10,7,2

        //2. Метод remove - УДАЛЕНИЕ индекса или элемента (если индексы не заданы)
        //Удаления происходят в той же последовательности, как и добавления выше

       // array.remove(1); //  у нас задан индекс 1 - удаляем его, а не первый элемент

       // 3. Метод size - с помощью него мы можем пробежаться по ArrayList, как и по массиву

    System.out.println(array.size()); // выводим количество заполняемых ячеек ArrayList
        //у нас size 4, а индексов 0,1,2,3 - тоже 4,но от 0

        //4. Метод - remove - находит в Arraylist и отдает (выводит нам выбранный элемент)
        //5. Метод  - array.contains аналогичный remove - достает точечно объект либо находит его индекс
        //6. Метод  -array.indexOf - аналогичный remove и contains
        //7. Метод - array.get() - достать элемент по индексу не удаляя его

       for (int i : array ){
           System.out.println(i);
    }





    ArrayList<Dog> dogList = new ArrayList<>(); // создаем ArrayList на собаку (перед эти создали класс Dog
        //с конструктором, get /set)
    Dog dog1 = new Dog("Molly", 5); // вводим данные для каждой собаки . Поля
    Dog dog2 = new Dog("TsaTsa", 4);
    Dog dog3 = new Dog("Foxy", 8);
    dogList.add(dog1);//добавляем собак в Araylist
    dogList.add(dog2);
    dogList.add(dog3);


//5. Метод  - array.contains (с англ. СОДЕРЖИТ) аналогичный remove - Мы узнаем есть ли в нашем листе собака 2 или нет
        // метод просто сравнивает true/false.Если он нашел с такой ссылкой объект (dog2) то он скажет
    System.out.println(dogList.contains(dog2));
    dogList.stream().forEach(x -> System.out.println(x.getName() + " "));// цикл, который выводит нужную нам задачу
    System.out.println();

        //4. Метод - remove - находит в Arraylist и отдает (выводит нам выбранный элемент по ссылке)
    System.out.println(dogList.remove(dog2));
    dogList.stream().forEach(x -> System.out.println(x.getName() + " "));
    System.out.println();

    System.out.println(dogList.remove(dog2));

    dogList.add(dog2);
    dogList.add(dog2);
    dogList.stream().forEach(x -> System.out.println(x.getName() + " "));
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
        //Заменим одну собаку (мы указываем ее индекс), на другую
        dogList.set(1, dog2);

        //
//        dogList.get(10);
        System.out.println(dogList.get(dogList.size() - 1).getName());

        // Позволяет узнать, пустой ли лист @return boolean
        dogList.isEmpty();

        // NullPointerException наш лист не инициализирован
//        ArrayList<Dog> arrayNull;
//        arrayNull.isEmpty();
        //Создали второй лист и новых собак
        //Метод ToAdd - добавляет все ссылки с первого листа во второй
        ArrayList<Dog> dogsToAdd = new ArrayList<>();
        dogsToAdd.add(new Dog("qwe", 1));
        dogsToAdd.add(new Dog("qwerr", 2));
        dogList.addAll(dogsToAdd);

        //** Вся панель:


       // dogList.get(); - достать элемент по индексу не удаляя его
        //dogList.set() - пустой элемент или нет, Замена объекта по индексу
        //dogList.size(); - размерность (длина)
        //dogList.remove()- УДАЛЕНИЕ индекса или элемента (если индексы не заданы)
       // dogList.add() - добавить
        //dogList.add() - добавит все ссылки с первого листа во второй
      // dogList.isEmpty() - Позволяет узнать, пустой ли лист @return boolean
        //dogList.indexOf() - номео ячейки (от 0)
        //dogList.contains()- содержит ли элемент да/нет
        // dogList.clone() - коппия листа






    }
}
