package shukan_stanislaw.lesson_1;

    /**
     * * - умножение
     * / - деление
     * - - разница
     * + - сумма
     *
     *  >< - больше/меньше
     *  == - сравнение, равны
     *  || - ИЛИ
     *  && - И
     *
     */
    public class Main {
        private static int chislo;

        public static void main(String[] args) {
            int a = 1;
            int b = 20;
            double doubleCheck = 2.0;
            String stroka = "Java guava";
            System.out.print("qweqwe");
            System.out.println("Hello world");
            System.out.println(a + b);
            System.out.println(stroka);
            a = 100;
            System.out.println(a);

            Integer chislo = 100;
            System.out.println(chislo.doubleValue());

            boolean predicate = false;
            Boolean predicate2 = true;

            // Если условие ДА, то
            if (predicate) {
                System.out.println("Условине выполнено");
                System.out.println("Условине2 выполнено");
                System.out.println("Условине3 выполнено");
                System.out.println("Условине4 выполнено");
            }

            // Сравнение (если равны, то)
            if (a == b) {
                System.out.println("Отдаю все деньги");
            }

            //Логическое И (оба условия должы быть выполнены)
            if (a > b && a == 100) {
                System.out.println("оба условия выполнены");
            }

            //Логическое или (хотя бы одно из условий выполнено)
            if (a > b || a == 1123) {
                System.out.println("Логическое ИЛИ");
            }

        }

        public static void check(String[] args) {

        }
    }
