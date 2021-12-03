package n_bogdan.lesson19;

public class Proveryaem {
    public static void main(String[] args) {
        String check = "CHecl";
        changeCheck(check);
        System.out.println();


        CheckClass check2 = new CheckClass("Name1");
        changeCheck2(check2);
        System.out.println();
    }
    private static void changeCheck2(CheckClass checkClass) {
        checkClass.setName("Name2");
        checkClass = new CheckClass("name 3");
    }
    private static void changeCheck(String s) {

        s = "New Checl";
        System.out.println("qwe");
    }
}
