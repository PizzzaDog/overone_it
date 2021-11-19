package b_vitaliy.test.task_1.participants;

import b_vitaliy.test.task_1.gems.Gems;

import java.util.ArrayList;

/*

Должен быть класс Client (заранее создаются 2 клиента
с разным набором денег и драгоценных камней),

 */
public class Client {
    String login;
    String name;
    String favouriteColor;
    Integer budget;
    ArrayList<Gems> gemsArrayList = new ArrayList<Gems>();

    public Client() {
    }

    public Client(String login, String name, String favouriteColor, Integer budget, ArrayList<Gems> gems) {
        this.login = login;
        this.name = name;
        this.favouriteColor = favouriteColor;
        this.budget = budget;
        this.gemsArrayList = gems;
    }

    public Client(String login, String name, String favouriteColor, Integer budget) {
        this.login = login;
        this.name = name;
        this.favouriteColor = favouriteColor;
        this.budget = budget;

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFavouriteColor() {
        return favouriteColor;
    }

    public void setFavouriteColor(String favouriteColor) {
        this.favouriteColor = favouriteColor;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public ArrayList<Gems> getGemsArrayList() {
        return gemsArrayList;
    }

    public void setGemsArrayList(ArrayList<Gems> gemsArrayList) {
        this.gemsArrayList = gemsArrayList;
    }

    public void addGems(Gems gems){
        this.gemsArrayList.add(gems);
    }

    public void removeGems(Gems gems){
        gemsArrayList.remove(gems);
    }

    public void removeGems(Integer gemsID){
        gemsArrayList.remove(gemsID);
    }
    public Integer size(){
        return gemsArrayList.size();
    }

    public void display(){
        System.out.println(name + ":");
        System.out.println("favourite color: " + favouriteColor);
        System.out.println("budget: " + budget);
        System.out.println("gems:");
        if (gemsArrayList.size()>0) {
            for (Gems gems : gemsArrayList) {
                System.out.print(" ");
                gems.display();
            }
        }
    }
}
