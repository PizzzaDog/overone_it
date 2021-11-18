package o_glazdunova.lesson9;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(); //создали нового человека
        //int a = human.getAge(); //мы заблокировали прямой доступ к коду, но оставили окошко для внешних сил,к-ые
        // смогут до него добраться

        Human human2 = new Human(); //создали еще одного человека

        human.setAge(10); // задали возраст первому чел
        human2.setAge(20); // задали возраст второму чел

        Human.setMaxAge(100); // задали максимальное значение

        System.out.println(human.getAge()); // вывели разницу между первым и вторым человеком
        }

    }

