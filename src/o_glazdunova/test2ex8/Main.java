package o_glazdunova.test2ex8;

import o_glazdunova.test2ex8.Flowers;
import o_glazdunova.test2ex8.Tulip;
import o_glazdunova.test2ex8.Rose;
import o_glazdunova.test2ex8.Cornflower;

import java.util.ArrayList;
import java.util.Random;

    public class Main {

        static Random r = new Random();

        public static void main(String[] args) {
            Flowers fl = randomizeFl();
            String smell = fl.smell();
            System.out.println(smell);
        }

        public static Flowers randomizeFl() {
            ArrayList<Flowers> fls = new ArrayList<>();
            Tulip tulip = new Tulip();
           Rose rose = new Rose();
            Cornflower cornflower = new Cornflower();
            fls.add(tulip);
            fls.add(rose);
            fls.add(cornflower);
            return fls.get(r.nextInt(3));
        }
        public static Flowers rendomizeFlWithSwitch() {

            switch (r.nextInt(3)) {
                case 0:
                    return new Tulip();
                case 1:
                    return new Rose();
                case 2:
                    return new Cornflower();
                default:
                    return new Tulip();
            }
        }
    }

//  8. Написать 1 пример интерфейса и его реализации. (+ вызов метода(ов) в main)