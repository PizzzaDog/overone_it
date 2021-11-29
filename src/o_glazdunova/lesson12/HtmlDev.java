package o_glazdunova.lesson12;

public class HtmlDev implements Developer{ //HtmjDev тоже разработчик и присваивает все что умеет Developer
    @Override// скопирировали метод
    public String writeCode() {//он умеет писать НОВЫЙ код, другой программой
        return "kek";// возвращает "kek"
    }
}