package m_katsko.test16_11.task1.metod;

import m_katsko.test16_11.task1.classes.Clients;

import java.util.Scanner;

public class CreateClients {
    Scanner sc= new Scanner(System.in);
    public Clients createClient(){

        Clients clients= new Clients();
        System.out.println("ВВедите ваше имя");
        clients.setName(sc.nextLine());
        System.out.println("ВВедите состояние кошелька");
        clients.setPoket( sc.nextInt());
        System.out.println("Введите  количестов вашших камней");
        int n=sc.nextInt();
        CreateStoun service= new CreateStoun();
        service.createArrayStone(n);
        System.out.println("Клиент создан");
        return clients;

    }

}
