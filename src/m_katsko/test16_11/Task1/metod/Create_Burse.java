package m_katsko.test16_11.Task1.metod;

import m_katsko.test16_11.Task1.Classes.Burse;

import java.util.Scanner;

public class Create_Burse {
    public Burse create_burse(){
        Burse burse=new Burse();
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        Create_Stoun service= new Create_Stoun();
        service.create_array_stone(n);
return burse;
    }
}
