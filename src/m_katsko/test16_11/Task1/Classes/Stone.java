package m_katsko.test16_11.Task1.Classes;

import java.util.ArrayList;
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

    public double getAverage_price() {
        return price;
    }

    public void setAverage_price(double price) {
        this.price = price;
    }

}
