package m_katsko.test16_11.task1;


import m_katsko.test16_11.task1.metod.CreateBurse;
import m_katsko.test16_11.task1.metod.CreateClients;



public class Main {
    public static void main(String[] args) {
        CreateClients clients = new CreateClients();
        clients.createClient();
        CreateBurse burse = new CreateBurse();
        burse.createBurse();

        }

    }



