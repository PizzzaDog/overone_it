package m_katsko.lesson_8;

import java.util.Scanner;

public class Qeshion {
    String tekst;
    String var1;
    String var2;
    String var3;
    int ittrue;

    Qeshion(String tekst, String var1, String var2, String var3, int ittrue) {
        this.tekst = tekst;
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
        this.ittrue = ittrue;
    }

    boolean proverka(int ittrue, int answer) {
        if (answer == ittrue) {
            System.out.print("Правильный ответ! ");
            return true;
        } else {
            System.out.println("Непрывильный ответ");
            return false;
        }
    }
}



