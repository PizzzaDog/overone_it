package viktor_sa.Test2.Task8;

public class Student implements Students {
    public static void main(String[] args) {
        System.out.println("Bookmarks: " + MakeBookmarks());
        System.out.println("name: " + name());
        System.out.println("Do you make homework? " + DoHomeWork());
        System.out.println("How many hours do you sleep? " + TimeToSleep());
        System.out.println("Do you connect this other students? " + ConnectOtherStudents());
    }

    public static int MakeBookmarks() {
        return 10;
    }

    public static String name() {
        return "Viktor";
    }


    public static Boolean DoHomeWork() {
        return true;
    }

    public static int TimeToSleep() {
        return 4;
    }

    public static Boolean ConnectOtherStudents() {
        return true;
    }
}
