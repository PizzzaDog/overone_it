package m_katsko.test16_11.Task1.metod;

import m_katsko.test16_11.Task1.Classes.Clients;
import m_katsko.test16_11.Task1.Classes.Stone;

import java.util.ArrayList;
import java.util.Scanner;

public class Create_Clients {
    public Clients create_client(){
        int poket;
        Clients clients= new Clients();
        Scanner sc= new Scanner(System.in);
        System.out.println("ВВедите ваше имя");
        clients.setName(sc.nextLine());
        System.out.println("ВВедите состояние кошелька");
        clients.setPoket( sc.nextInt());
        System.out.println("Введите  количестов вашших камней");
        int n=sc.nextInt();
        Create_Stoun service= new Create_Stoun();
        service.create_array_stone(n);

        return clients;

    }
}
