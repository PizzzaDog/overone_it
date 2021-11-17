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
        displayConducting();
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

            }
        }

    }

    public void transferToClient(Client client, Gems gems){
        client.addGems(gems);
        gemsOfGemsMarket.remove(gems);
    }

    public void sellGems(){

        for(Client client: clientArrayList){


                if(login.equals(client.getLogin()) != true) {
                    for(Gems gems: client.getGemsArrayList()) {
                        if (gems.getColor() == client.getFavouriteColor()) {
                            gems.setCost(gems.getCost() * 2);
                            transferIntoGemsMarket(client, gems);
                        }
                        else{
                            transferIntoGemsMarket(client, gems);
                        }

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

        for(Gems gems: client.getGemsArrayList()) {
            gems.display();
            Scanner scan = new Scanner(System.in);
            System.out.println("how many gems do you want to sell?");
            amoOfSelledGems = scan.nextInt();

            System.out.println("how much do they cost?");
            costOfSellGems = scan.nextInt();

            if(gems.getAmoGems()>amoOfSelledGems) {
                gemsOfGemsMarket.add(gems);
                gemsOfGemsMarket.get(gemsOfGemsMarket.size() - 1).setCost(costOfSellGems);
                gemsOfGemsMarket.get(gemsOfGemsMarket.size() - 1).setAmoGems(amoOfSelledGems);
                gems.setAmoGems(gems.getAmoGems() - amoOfSelledGems);
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

}
