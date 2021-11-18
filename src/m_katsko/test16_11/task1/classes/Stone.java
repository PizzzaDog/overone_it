package m_katsko.test16_11.task1.classes;

import java.util.Scanner;

public class Stone {

    public String title;
    public double price;

    public Stone() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Название камня");
        this.title= sc.nextLine();
        System.out.println("Его стоймость");
        this.price= sc.nextInt();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getAveragePrice() {
        return price;
    }

    public void setAveragePrice(double price) {
        this.price = price;
    }

}
