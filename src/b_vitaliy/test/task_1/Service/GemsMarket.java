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
        System.out.println();
        login();
        sellGems();
        buyGems();
    }




    public void login(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your login");

        login = scan.nextLine();
    }


    public void buyGems() {
        Client client;
        Gems gems;
        int lengthOfGemsArrayList;
        Integer amoOfBoughtGems;

        Gems gemsForPerson;
        lengthOfGemsArrayList = gemsOfGemsMarket.size();

        int j;
        for (j = lengthOfGemsArrayList - 1; j >= 0; j--) {
            gems = gemsOfGemsMarket.get(j);
            for (int i = 0; i < clientArrayList.size(); i++) {
                client = clientArrayList.get(i);

                if (login.equals(client.getLogin()) != true) {


                    if (gems.getColor().equals(client.getFavouriteColor())) {

                        amoOfBoughtGems = client.getBudget() / gems.getCost();

                        if (amoOfBoughtGems !=0) {
                            if (gems.getAmoGems() > amoOfBoughtGems) {
                                gemsForPerson = new Gems();
                                gemsForPerson.setColor(gems.getColor());
                                gemsForPerson.setCost(gems.getCost());
                                gemsForPerson.setName(gems.getName());
                                gemsForPerson.setAmoGems(amoOfBoughtGems);

                                gems.setAmoGems(gems.getAmoGems() - amoOfBoughtGems);


                                client.addGems(gemsForPerson);
                                takeMoneyForGems(client, gems);

                            } else {
                                takeMoneyForGems(client, gems);
                                transferToClient(client, gems);
                            }
                        }
                    }

                } else {
                    personBuyGems(client, gems);
                }


            }

        }
    }

    public void personBuyGems(Client client, Gems gems){
        Integer amoOfBoughtGems;
        Scanner scan = new Scanner(System.in);
        Gems gemsForPerson;

        gems.display();
        System.out.println("your budget: " + client.getBudget());
        System.out.println("how many gems do you want to buy?");
        amoOfBoughtGems = scan.nextInt();


        if(amoOfBoughtGems > 0){
            amoOfBoughtGems = amoOfBoughtGems % ((client.getBudget() / gems.getCost())+1);
            if (gems.getAmoGems() > amoOfBoughtGems) {
                gemsForPerson = new Gems();
                gemsForPerson.setColor(gems.getColor());
                gemsForPerson.setCost(gems.getCost());
                gemsForPerson.setName(gems.getName());
                gemsForPerson.setAmoGems(amoOfBoughtGems);

                gems.setAmoGems(gems.getAmoGems() - amoOfBoughtGems);


                client.addGems(gemsForPerson);
                takeMoneyForGems(client, gemsForPerson);

            } else {
                takeMoneyForGems(client, gems);
                transferToClient(client, gems);
            }


        }
    }

    public void takeMoneyForGems(Client payer, Gems gems){

        payer.setBudget(payer.getBudget() - gems.getCost()*gems.getAmoGems());

        for (int i = 0; i < clientArrayList.size();i++){
            if (clientArrayList.get(i).getLogin().equals(gems.getSellerLogin())){
                clientArrayList.get(i).setBudget(clientArrayList.get(i).getBudget()+gems.getCost()*gems.getAmoGems());
                break;
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

                    lengthOfGemsArrayList = client.getGemsArrayList().size();
                    for(int i = 0; i < lengthOfGemsArrayList; i++) {

                        gems = client.getGemsArrayList().get(0);

                        if (gems.getColor().equals(client.getFavouriteColor())) {
                            gems.setCost(gems.getCost() * 2);
                        }
                        gems.setSellerLogin(client.getLogin());
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
        for(int i = length-1; i >= 0; i--) {
            gems = client.getGemsArrayList().get(i);
            Gems gemsForGemsMarket;
            gems.display();
            Scanner scan = new Scanner(System.in);
            System.out.println("how many gems do you want to sell?");
            amoOfSelledGems = scan.nextInt();

            if (amoOfSelledGems > 0) {

                System.out.println("how much do they cost?");
                costOfSellGems = scan.nextInt();

                if (gems.getAmoGems() > amoOfSelledGems) {

                    gemsForGemsMarket = new Gems();
                    gemsForGemsMarket.setColor(gems.getColor());
                    gemsForGemsMarket.setName(gems.getName());
                    gemsForGemsMarket.setCost(costOfSellGems);
                    gemsForGemsMarket.setSellerLogin(client.getLogin());

                    gemsForGemsMarket.setAmoGems(amoOfSelledGems);
                    gems.setAmoGems(gems.getAmoGems() - amoOfSelledGems);

                    gemsOfGemsMarket.add(gemsForGemsMarket);

                } else {
                    gems.setCost(costOfSellGems);
                    gems.setSellerLogin(client.getLogin());
                    transferIntoGemsMarket(client, gems);
                }
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
