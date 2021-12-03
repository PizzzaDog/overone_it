package n_bogdan.lesson19;

import n_bogdan.lesson18.MyOwnException;

import java.util.LinkedList;
import java.util.Random;

public class ForExceptionQuestion {
    public static void main(String[] args) {
//        LinkedList
        Random r = new Random();
        try {
            switch (r.nextInt(3)) {
                case 0 : throw new Exception();
                case 1 : throw new MyException();
                case 2 : throw new NullPointerException();
            }
        } catch (MyException e) {
            System.out.println();
        } catch (NullPointerException e) {
        } catch (Exception e) {
        }
    }
}
