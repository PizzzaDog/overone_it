package m_katsko.test16_11.task1.metod;

import m_katsko.test16_11.task1.classes.Burse;

import java.util.Scanner;

public class CreateBurse {
    Scanner sc = new Scanner(System.in);
    public Burse createBurse() {
        System.out.println("Камни на бирже");
        Burse burse = new Burse();
        int n = sc.nextInt();
        CreateStoun service = new CreateStoun();
        service.createArrayStone(n);
        System.out.println("Биржа укомплектована");
        return burse;
    }
}
