package a_rogatko.lesson10.ticTacToe;

public class Robot {


    static void step(Field f) {
        boolean use = false;

        while (!use) {
            int i = (int) (Math.random() * 3) + 1;
            int j = (int) (Math.random() * 3) + 1;
            if (f.pointGet(i, j) != f.x && f.pointGet(i, j) != f.o) {
                f.pointSet(i, j, 'o');
                System.out.println("****** " + i + " ***** " + j);
                use = true;
            }


        }

    }
}
