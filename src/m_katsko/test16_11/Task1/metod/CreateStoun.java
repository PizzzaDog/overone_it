package m_katsko.test16_11.Task1.metod;

import m_katsko.test16_11.Task1.Classes.Stone;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateStoun {


    public ArrayList<Stone> createArrayStone(int n) {
        ArrayList<Stone> collection = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Stone stone1 = new Stone();
            collection.add(stone1);
        }
        return collection;
    }
}