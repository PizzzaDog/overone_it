package o_glazdunova.lesson12;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    static Random r = new Random();//чтобы не писать рандом в каждом методе, мы его вывели в класс и сделали static

    public static void main(String[] args) {
        Developer dev = randomizeDev();//положили не конкретного программера, рандомного
        String code = dev.writeCode();//выводит строку, которую напишет наша разработка
        System.out.println(code); // выводим в консоль код, который напишет выбранный рандомом программист

    }

// получается что мы создаем 3 типа программистов, говорим, что они все умеют писать код, который наследуют от Developer
    //записываем у каждого отдельно, какой именно код.
    // и в классе Main описываем и создаем то что сделает каждый программист

    public static Developer randomizeDev() {
        ArrayList<Developer> devs = new ArrayList<>();// создаем ArrayList, к-ый хранит в себе разработчиков = новому листу
        // название devs-придумали сами с головы.
        // теперь мы создаем новую коллекцию и положим туда программистов.

        JavaDev javaDev = new JavaDev();//берем Джависта создаем нового
        AngularDev angularDev = new AngularDev();// берем ангулярщика и создаем нового
        HtmlDev htmlDev = new HtmlDev();//берем Хтмщика и создаем нового
        devs.add(javaDev);//кладем в эту коллекцию Джависта (методом add)
        devs.add(angularDev);//кладем в эту коллекцию ангулярщика (методом add)
        devs.add(htmlDev);//кладем в эту коллекцию Хтмщика (методом add- добавление)
        return devs.get(r.nextInt(3));// выводим из нового листа devs одного из программистов (точнее код,к-ый он напишет)

    }

    public static Developer rendomizeDevWithSwitch() {// чтобы не писать лишних строк и избежать повторений
        //применим метод switch
        switch (r.nextInt(3)) {
            case 0:
                return new JavaDev();
            case 1:
                return new AngularDev();
            case 2:
                return new HtmlDev();
            default:
                return new JavaDev();
        }
    }
}
