package o_glazdunova.lesson6;

import java.net.SocketOption;

public class Task1 {
    public static void main(String[] args) {
        String[] name = new String[]{"Good", "Like", "Hello", "Love"}; //создаем массив тип String, 4 элемента
        for (String k : name) { //присваиваем слову имя
            System.out.println(k.length());//выводим длину каждого слова в панель
        }


        for (String k : name) {
            int s = 0;//пристаеваем согласным имя
            for (int i = 0; i < k.length(); i++) { //создаем цикл,чтобы приминить к каждой ячейке условие
                if (k.charAt(i) == 'e' || k.charAt(i) == 'i' || k.charAt(i) == 'o') {
                    s++; //задаем метод для гласных букв
                }
            }
                    System.out.println(k + s); // выводим слово и количество в нем гласных букв.
                }
            }
        }



//**
// * Создать массив элементов типа String размером 4
// * Заполнить его словами
//* Пробежаться по массиву и вывести в консоль количество гласных букв в каждом слове
// * <p>
//* v2.0 Вывести в консоль длину каждого слова (количество букв)
// */
