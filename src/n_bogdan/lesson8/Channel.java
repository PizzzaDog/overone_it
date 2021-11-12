package n_bogdan.lesson8;


public class Channel {
    private String inn;
    private int channelId;

    public Channel(String inn, int channelId) {
        this.inn = inn;
        this.channelId = channelId;
    }

    public Channel() {
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }
}
