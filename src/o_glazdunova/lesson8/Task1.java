package o_glazdunova.lesson8;


public class Task1 {
    public static void main(String[] args) {
        String[] name = new String[]{"а", "е", "ё", "и", "о", "у", "ы", "э", "ю", "я"};
        for (int i = 0; i < name.length; i++)
            System.out.println(name[i]);
        for (int i = 0; i < name.length; i = i + 2)
            System.out.println(name[i] + "Через одну букву");
    }
}

//   for (String a : name){
//     System.out.println(a+ " "); можно было сделать так
