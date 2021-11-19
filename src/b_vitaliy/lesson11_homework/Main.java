package b_vitaliy.lesson11_homework;


import b_vitaliy.lesson11_homework.zoo.Fish;
import b_vitaliy.lesson11_homework.zoo.Penguin;
import b_vitaliy.lesson11_homework.zoo.Racoon;
import b_vitaliy.lesson11_homework.zooServese.ZooService;

public class Main {
    public static void main(String[] args){
        Fish fish = new Fish("GoldFish", 3);
        Penguin penguin = new Penguin("josh");
        Racoon racoon = new Racoon("racoon", 129, 1234567);

        ZooService zooService = new ZooService();

        zooService.scream(fish);
        zooService.scream(penguin);
        zooService.scream(racoon);


    }
}
