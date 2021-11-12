package viktor_sa.lesson12;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Developer dev = randomizeDev();
        String code = dev.writeCode();
        System.out.println(code);
    }

    public static Developer randomizeDev() {
        ArrayList<Developer> devs = new ArrayList<>();
        JavaDev javadev = new JavaDev();
        AngularDev angularDev = new AngularDev();
        HtnlDev htmlDev = new HtnlDev();
        devs.add(javadev);
        devs.add(angularDev);
        devs.add(htmlDev);

        Random r = new Random();
        return devs.get(r.nextInt(3));
    }


}
