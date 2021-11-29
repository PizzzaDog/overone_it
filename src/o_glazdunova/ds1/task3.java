package o_glazdunova.ds1;

import java.util.Scanner;


public class task3 {
    private static Scanner Scan;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Сканер,чтобы вводить в консоль инфу
        Integer pass1 = 5555; // пароль основной /Integer- спользуется для цифр и текста.
        Integer pass2 = 4444;//пароль запасной
        Integer sov; // просто дает общее название паролям и Integer
        System.out.println("Hello write your Password"); //выводим "привет,напиши свой пароль"
        sov=sc.nextInt();
        if (sov.toString().length() != 4) System.out.println("Error");// если ввели пароль больше 4 цифр,то
        else switch (sov) { //пока переключается на кейс 5555, то пишем привет
            case 5555:
                System.out.println("Hello");
                break; // остановить цикл
            case 4444:
                System.out.println("Hello, change yor password");//пока переключается на кейс 4444, то пишем привет поменяй пороль
                break;
            default: // если не выполняетс яни одно из условий ,то пишется ошибка
                System.out.println("Error");

        }
    }
}


                  //Создать 2 пароля: основной и запасной.

           // Ввести с клавиатуры 4 значный пароль (из цифр)
          //  Если пароль верный, написать "Hello"
           // Если ввели верный запасной пароль, написать "Hello, change your password"
           // Если неверный, написать "Wrong Password"
           // Если пароль не из 4 цифр, написать ("Error");