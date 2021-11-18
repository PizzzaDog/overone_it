package m_katsko.test16_11.task1.classes;

import java.util.ArrayList;

public class Shablon {
    public double poket;
    public ArrayList<Stone> collection= new ArrayList<>();

    public double getPoket() {
        return poket;
    }

    public void setPoket(double poket) {
        this.poket = poket;
    }

    public ArrayList<Stone> getCollection() {
        return collection;
    }

    public void setCollection(ArrayList<Stone> collection) {
        this.collection = collection;
    }
}
