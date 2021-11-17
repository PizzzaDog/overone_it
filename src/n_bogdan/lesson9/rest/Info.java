package n_bogdan.lesson9.rest;

public class Info {
    public static void main(String[] args) {
        Guest guest1 = new Guest(10, "Andrew");
        Guest guest2 = new Guest("qwe", 1);
        Guest guest3 = new Guest("Steve");
        Guest guest4 = new Guest();
        Guest veryNiceGuest = guest3;

        //Положили guest1, а точнее ССЫЛКУ на guest1
        Guest[] guests = new Guest[]{guest1, guest2, guest3, guest4};

        //Достали 0 элемент по ссылке (На guest1) - взяли имя
        System.out.println(guests[0].getName());

        //Пошли по ссылке на guest1, изменили имя
        guest1.setName("Ne Andrew");

        //Достали 0 элемент по ссылке (На guest1) - взяли имя
        System.out.println(guests[0].getName());
    }
}
