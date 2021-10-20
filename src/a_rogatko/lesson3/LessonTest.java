package a_rogatko.lesson3;
//Проходим тест)))


import java.util.Scanner;

public class LessonTest {
    public static void main(String[] args) {
        int result = 0; //переменная для результатов теста
        DataForTest MyData = new DataForTest(); //создаем класс, в котором хранятся наши данные
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < MyData.amount; i++) { //цикл, проходимся по ответам
            System.out.println(MyData.txt[i]); //выводим вопрос в консоль
            int temp = scanner.nextInt(); //получаем номер варианта ответа
            if (temp == MyData.numberForAnswer[i]) { //проверяем, правильный ли ответ
                result++; //если ответ правильный, прибавляем единицу к результату

            }

        }


        String uncertainty = "а"; //начинаем добавлять правильные окончания к выводу результата
        if (result == 1) uncertainty = "";
        if (result == 0) uncertainty = "ов"; // заканчиваем это дело)))
        System.out.println("Отвечено правильно на " + result + " вопрос" + uncertainty + " из " + MyData.amount); //выводим результат в консоль
    }

}

class DataForTest {

    String[] txt = {"Как зовут новогоднего типа в красном тулупе?\n 1 -Пиннокио \n 2 -Дед Мороз  \n 3 -Годзилла",
            "Как зовут ведущего курса \"Java for teapots\" в IT_OVERONE? \n 1 -Дед Мороз \n 2 -Вася Пупкин \n 3 -Николай",
            "Как в Java выглядит символ табуляции? \n 1 - \\t \n 2 - \\a \n 3 - \\хз"
    };//это был массив с вопросами и вариантами ответа
    int[] numberForAnswer = {2, 3, 1}; //массив с номерами правильного ответа на вопросы

    public int amount = txt.length; //количество вопросов, можно было бы легко обойтись без этой переменной
}

