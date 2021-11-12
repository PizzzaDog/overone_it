package o_glazdunova.lesson9.rest;

public class Info {
    public static void main(String[] args) {
        // решаем с помощью массива
        //создаем гостей и вписываем их параметры,конструктор сам считывает к какому конструктору отнести
        Guest guest1 = new Guest(10, "Andrew");
        Guest guest2 = new Guest("qwe", 1);
        Guest guest3 = new Guest("Steve");
        Guest guest4 = new Guest();
        Guest veryNiceGuest = guest3;

        Guest[] guests = new Guest[]{guest1, guest2, guest3, guest4}; //создаем массив из гостей
        //в массиве хранятся только ссылки на тип данных.ПРимер guest1-это ссылка в которой гость Андрей с 10 $

        //Достали 0 элемент по ссылке (На guest1) -вывели первую переменную массива в консоль. Это тоже Андрей
        System.out.println(guests[0].getName());

        //Специально поменяли имя в ССЫЛКЕ и выводим [0]
        guest1.setName("Ne Andrew");

        //выводим [0] по массиву
        System.out.println(guests[0].getName());
    }
}


