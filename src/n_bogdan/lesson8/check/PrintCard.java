package n_bogdan.lesson8.check;

class PrintCard {
    static	void printAll(String[] names, int[] kr, int[] nojek, int[] kart) {
        for (int i = 0; i < Run.clients; i++) {
            if (names[i] != null) {
                System.out.print("Клиент " + names[i] + " заказал " + kr[i] + " крылышек " + nojek[i] + " ножек " + kart[i] + " картошек");
                System.out.println();


            }
        }
    }
}
