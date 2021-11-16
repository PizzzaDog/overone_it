package viktor_sa.lesson9;

public class Info {
    public static void main(String[] args) {
        Guest guest1 = new Guest("Bob", 1000);
        Guest guest2 = new Guest("Steve", 1000);
        Guest guest3 = new Guest("Andrew", 1000);
        Guest guest4 = new Guest("Natasha", 1000);

        Guest[] guests = new Guest[] {guest1, guest2, guest3, guest4};
        System.out.println(guests[0].getName());

    }

}
