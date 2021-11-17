package n_bogdan.lesson12;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    static Random r = new Random();

    public static void main(String[] args) {
        Developer dev = randomizeDev();
        String code = dev.writeCode();
        System.out.println(code);

    }



    public static Developer randomizeDev() {
        ArrayList<Developer> devs = new ArrayList<>();
        JavaDev javaDev = new JavaDev();
        AngularDev angularDev = new AngularDev();
        HtmlDev htmlDev = new HtmlDev();
        devs.add(javaDev);
        devs.add(angularDev);
        devs.add(htmlDev);
        return devs.get(r.nextInt(3));
    }

    public static Developer rendomizeDevWithSwitch() {
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
