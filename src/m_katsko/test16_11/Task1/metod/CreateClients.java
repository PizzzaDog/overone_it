package m_katsko.test16_11.Task1.metod;

import m_katsko.test16_11.Task1.Classes.Clients;

import java.util.Scanner;

public class CreateClients {
    public Clients createClient(){
        Clients clients= new Clients();
        Scanner sc= new Scanner(System.in);
        System.out.println("ВВедите ваше имя");
        clients.setName(sc.nextLine());
        System.out.println("ВВедите состояние кошелька");
        clients.setPoket( sc.nextInt());
        System.out.println("Введите  количестов вашших камней");
        int n=sc.nextInt();
        CreateStoun service= new CreateStoun();
        service.createArrayStone(n);

        return clients;

    }
}