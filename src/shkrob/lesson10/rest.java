package shkrob.lesson10;

public class rest {
    public static void main(String[] arg) {
        Guest guest1 = new Guest(10, "Andrew");
        Guest guest2 = new Guest("qwe", 1);
        Guest guest3 = new Guest("Steve");
        Guest guest4= new Guest();
        Guest veryNicetGuest = guest3;

        Guest[] guests = new Guest[]{guest1, guest2, guest3, guest4};
        System.out.println(guests[0].getName());

        guest1.setName("Ne Andrew");
        System.out.println(guests[0].getName());

    }
}
