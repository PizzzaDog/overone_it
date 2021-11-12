package o_glazdunova.lesson7;

public class Question {
    String predicate; //задаем вопрос
    String var1; //варианты ответа
    String var2;
    int answer; // цифра с правильным вариантом ответа

    public Question(String predicate, String var1, String var2, int answer) {
        this.predicate = predicate;
        this.var1 = var1;
        this.var2 = var2;
        this.answer = answer; }

    public Question() {
    }
}
