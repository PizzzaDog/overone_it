package m_katsko.test16_11.Task1.metod;

import m_katsko.test16_11.Task1.Classes.Burse;

import java.util.Scanner;

public class CreateBurse {
    public Burse createBurse(){
        Burse burse=new Burse();
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        CreateStoun service= new CreateStoun();
        service.createArrayStone(n);
return burse;
    }
}
