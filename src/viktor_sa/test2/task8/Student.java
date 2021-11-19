package viktor_sa.test2.task8;

public class Student implements Students {
    public static void main(String[] args) {
        System.out.println("Bookmarks: " + makeBookmarks());
        System.out.println("name: " + name());
        System.out.println("Do you make homework? " + doHomeWork());
        System.out.println("How many hours do you sleep? " + timeToSleep());
        System.out.println("Do you connect this other students? " + connectOtherStudents());
    }

    public static int makeBookmarks() {
        return 10;
    }

    public static String name() {
        return "Viktor";
    }


    public static Boolean doHomeWork() {
        return true;
    }

    public static int timeToSleep() {
        return 4;
    }

    public static Boolean connectOtherStudents() {
        return true;
    }
}
