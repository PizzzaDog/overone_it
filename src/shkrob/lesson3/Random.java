package shkrob.lesson3;

public class Random {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {

            int a = (int) (Math.random() * 20);


            if (a > 10) {
                System.out.println(a + "*");
            } else {

                System.out.println(a);
            }

            //Поставь этот цикл в нужное место

            // Подсказка: здесь должен быть код который должен вывполнится 20 раз
        }
    }
}
