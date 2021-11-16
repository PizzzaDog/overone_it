package m_katsko.test16_11.Task1;

import m_katsko.test16_11.Task1.metod.Create_Burse;
import m_katsko.test16_11.Task1.metod.Create_Clients;

public class Main {
    public static void main(String[] args){
        Create_Clients clients=new Create_Clients();
        clients.create_client();
        Create_Burse burse= new Create_Burse();
        burse.create_burse();


    }


}
