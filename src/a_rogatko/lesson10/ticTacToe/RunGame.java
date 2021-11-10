package a_rogatko.lesson10.ticTacToe;

import java.util.Scanner;

public class RunGame {


    static void run() {

        Field f = new Field();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Поехали!!!!");
        boolean isWinner = false;//переменная есть ли победитель
        f.fieldInit();//инициализация игрового поля

        for (int steps = 0; steps < 9; steps++) {
            f.fieldPrint();

            if ((WinChecker.allCheck(f.field) == f.x) || (WinChecker.allCheck(f.field) == f.o)) {
                steps = 9;
                isWinner = true;

                System.out.println("Победили " + (WinChecker.allCheck(f.field)));

            }


            if (steps % 2 == 0) {
                boolean use = false;
                while (!use) {
                    System.out.println("\nВаш ход");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    //


                    if (f.pointGet(a, b) != f.x && f.pointGet(a, b) != f.o) {
                        f.pointSet(a, b, f.x);
                        use = true;
                    } else {
                        System.out.println("Клетка занята");
                        f.fieldPrint();

                    }
                }

            } else {
                if (!isWinner) Robot.step(f);
            }


            if (!isWinner && steps == 8) {
                System.out.println("Ничья!");
            }
        }


    }
}
