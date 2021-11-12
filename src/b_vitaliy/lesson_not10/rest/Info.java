package b_vitaliy.lesson_not10.rest;

public class Info {
    public static void main(String[] args) {

        Guest guest1 = new Guest(10, "Andrew");
        Guest guest2 = new Guest("qwe", 1);
        Guest guest4 = new Guest();
        Guest guest3 = new Guest("Mike");

        Guest[] guest = new Guest[]{guest1, guest2, guest3, guest4};

        System.out.println(guest[0].getName());

        guest1.setName("Ne Andrew");

        System.out.println(guest[0].getName());

    }
}
