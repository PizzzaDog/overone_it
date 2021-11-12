package viktor_sa.lesson7;

public class Question {
    String predicate;
    String var1;
    String var2;
    int answer;

    Question(String predicate, String var1, String var2, int answer) {
        this.predicate = predicate;
        this.var1 = var1;
        this.var2 = var2;
        this.answer = answer;
    }
    public Question() {}
}
