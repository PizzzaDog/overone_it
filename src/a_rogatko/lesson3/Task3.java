package a_rogatko.lesson3;



import java.util.Scanner; //импортируем библиотеку для ввода в консоль

public class Task3 {

    public static void main(String[] args) {
        int password = 1111; // задаем основной пароль
        int password1 = 9999; // задаем дополнительный пароль
        System.out.println("Введите пароль");// Создаем приглашение для ввода пароля
        Scanner scanner = new Scanner(System.in); // создаем объект сканнер, который может читать ввод из консоли
        int inputPassword = scanner.nextInt(); // вводим пароль в консоль
        if (inputPassword / 1000 < 1 || inputPassword / 1000 > 10) {
            System.out.print("Error же..."); //проверяем количество цифр и реагируем
        }
        else if (inputPassword == password) {
            System.out.print("Hello");//проверяем на соответствие первому паролю и реагируем
        }
        else if (inputPassword == password1) {
            System.out.print("Hello, change your password");// проверяем на соответствие второму паролю и реагируем
        }
        else {
            System.out.print("Wrong password"); // если пароль соответствует количеству цифр, но не соответствует ни
            // первому паролю, ни второму, реагируем
            scanner.close();// закрываем сканнер на всякий случай))) (необязательно)
        }

    }

}
