package n_bogdan.info.arch.service;

import n_bogdan.info.arch.MyOwnRepository;
import n_bogdan.info.arch.model.MyOwn;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MyOnwService {
    MyOwnRepository repository;

    public void login(HttpRequest request) {
        repository.getUser("ID");
    }
}
