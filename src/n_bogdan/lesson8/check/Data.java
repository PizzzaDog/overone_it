package n_bogdan.lesson8.check;

class Data {
    public	String[] names = new String[Run.maxClients];
    int[] kr = new int[Run.maxClients];
    int[] n = new int[Run.maxClients];
    int[] k = new int[Run.maxClients];
    public	void setData(int clients, String name, int kri, int nojek, int kart) {
        names[clients] = name;
        kr[clients] = kri;
        n[clients] = nojek;
        k[clients] = kart;
    }
}
