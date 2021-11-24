package v_kovalev.test_2.task_1;

public interface Stone {
    void buy(Client client, Exchange exchange);

    void change(Client client, Exchange exchange);

    void sell(Client client, Exchange exchange);
}
