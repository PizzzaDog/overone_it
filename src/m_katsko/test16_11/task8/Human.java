package m_katsko.test16_11.task8;

public class Human implements HumanActiviti{
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void ran() {
        System.out.println("She is champion");
    }
}
