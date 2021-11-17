package o_glazdunova.home12;

import o_glazdunova.lesson12.AngularDev;
import o_glazdunova.lesson12.Developer;
import o_glazdunova.lesson12.HtmlDev;
import o_glazdunova.lesson12.JavaDev;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    static Random r = new Random();

    public static void main(String[] args) {
        Cream cr = randomizeCr(); //крем кр.= (для глаз). Поменяли на рандомный крем.
        String action = cr.takeCareOfTheSkin(); // действие = крем, ухаживающий за кожей
        System.out.println(action); //выводит действие крема
    }

    public static Cream randomizeCr() {
        ArrayList<Cream> crs = new ArrayList<>(); // создаем лист с кремами
        ForEyes forEyes = new ForEyes();
        ForFace forFace = new ForFace();
        ForNeck forNeck = new ForNeck();
        crs.add(forEyes);
        crs.add(forFace);
        crs.add(forNeck);
        return crs.get(r.nextInt(3));
    }
    public static Cream rendomizeCrWithSwitch() {// чтобы не писать лишних строк и избежать повторений
        //применим метод switch
        switch (r.nextInt(3)) {
            case 0:
                return new ForEyes();
            case 1:
                return new ForFace();
            case 2:
                return new ForNeck();
            default:
                return new ForNeck();
        }
    }
}
