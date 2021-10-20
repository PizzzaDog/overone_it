package a_rogatko.lesson3.task4;


public class Main {

    public static void main(String[] args) {
        int a = 1; // первый множитель
        int b = 1; // второй множитель
        for (int outsideCounter = 0; outsideCounter < 10; outsideCounter++) { // нам нужно 10 столбцов
            for (int insideCounter = 0; insideCounter < 10; insideCounter++) { // нам нужно 10 строк
                System.out.print(a * b + " "); // печатаем произведение a и b
                if (a * b < 10) //проверяем одноразрядное число или нет (для того чтобы выровнять строки, в задании этого не было)))
                    System.out.print(" "); // ровняем строки, если число одноразрядное, печатаем дополнительный пробел
                if (insideCounter != 0 && (insideCounter + 1) % 10 == 0)
                    System.out.println(); // если внутренний счетчик отсчитал 10 строк переходим на следующую
                a++;//увеличиваем первый множитель на единицу

            }
            b++; //увеличиваем второй множитель на единицу
            a = 1;//меняем значение первого множителя

        }

    }
}
