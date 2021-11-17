package b_vitaliy.test.task_1.Service;

import b_vitaliy.test.task_1.gems.Gems;
import b_vitaliy.test.task_1.participants.Client;

import java.util.ArrayList;
import java.lang.Thread;
import java.util.Scanner;

/*

Client (2 клиента с разным набором денег и драгоценных камней),
так же класс биржа, на которой тоже есть определенный набор камней.
Пользователь может зайти под логином одного из Client,
и поучаствовать в торгах. Разные камни обмениваются/покупаются/продаются
по разному курсу.
 */
public class GemsMarket {

    ArrayList<Client> clientArrayList = new ArrayList<>();
    String login;
    ArrayList<Gems> gemsOfGemsMarket = new ArrayList<Gems>();

    public GemsMarket() {

    }


    public GemsMarket(ArrayList<Client> clientArrayList) {
        this.clientArrayList = clientArrayList;
    }

    public void addClient(Client client1){
        clientArrayList.add(client1);
    }

    public void conductBargain() throws InterruptedException {
        //displayConducting();
        login();
        sellGems();
        buyGems();
    }




    public void login(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your login");

        login = scan.nextLine();
    }


    public void buyGems(){
        for(Client client: clientArrayList){
            for(Gems gems:gemsOfGemsMarket){
                if(login.equals(client.getLogin()) != true) {
                    if(gems.getColor() == client.getFavouriteColor()){
                      //  transferToClient(client, gems);
                    }
                    //gems.display();
                }
            //client.display();
                //gems.display();
            }
        }

    }

    public void transferToClient(Client client, Gems gems){
        client.addGems(gems);
        gemsOfGemsMarket.remove(gems);
    }

    public void sellGems(){

        Gems gems;
        Client client;
        int lengthOfGemsArrayList;
        for(int j = 0; j < clientArrayList.size(); j++){
            client = clientArrayList.get(j);

                if(login.equals(client.getLogin()) != true) {

                    //for(Gems gems: client.getGemsArrayList()) {
                    lengthOfGemsArrayList = client.getGemsArrayList().size();
                    for(int i = 0; i < lengthOfGemsArrayList; i++) {

                        gems = client.getGemsArrayList().get(0);

                        if (gems.getColor() == client.getFavouriteColor()) {
                            gems.setCost(gems.getCost() * 2);
                        }
                            transferIntoGemsMarket(client, gems);
                        }

                    }


                else if (login.equals(client.getLogin())) {
                    personSellGems(client);
                }





        }

    }

    public void personSellGems(Client client){
        Integer amoOfSelledGems;
        Integer costOfSellGems;
        Gems gems;
        int length  = client.getGemsArrayList().size();
        for(int i = 0; i < length; i++) {
            gems = client.getGemsArrayList().get(i);
            Gems gemsForGemsMarket;
            gems.display();
            Scanner scan = new Scanner(System.in);
            System.out.println("how many gems do you want to sell?");
            amoOfSelledGems = scan.nextInt();

            System.out.println("how much do they cost?");
            costOfSellGems = scan.nextInt();

            if(gems.getAmoGems()>amoOfSelledGems) {
                gemsForGemsMarket = new Gems();
                gemsForGemsMarket.setColor(gems.getColor());
                gemsForGemsMarket.setName(gems.getName());


                gemsForGemsMarket.setCost(costOfSellGems);
                gemsForGemsMarket.setAmoGems(amoOfSelledGems);
                gemsOfGemsMarket.add(gemsForGemsMarket);

                gems.setAmoGems(gems.getAmoGems() - amoOfSelledGems);
                //client.addGems(gems);

            }
            else {
                transferIntoGemsMarket(client, gems);
                gemsOfGemsMarket.get(gemsOfGemsMarket.size() - 1).setCost(costOfSellGems);
            }

        }
    }

    public void transferIntoGemsMarket(Client client, Gems gems){
        gemsOfGemsMarket.add(gems);
        client.removeGems(gems);
    }

    public void displayConducting() throws InterruptedException {
        System.out.print("\ncounduct bargain...");
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <=3; j++){

                Thread.sleep(300);
                System.out.print("\b");
            }
            for(int j = 1; j<=3; j++){
                Thread.sleep(300);
                System.out.print(".");
            }
        }
    }


    public void display(){
        for(Gems gems: gemsOfGemsMarket ){
            gems.display();
        }
    }
}
