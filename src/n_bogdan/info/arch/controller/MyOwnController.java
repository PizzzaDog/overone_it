package n_bogdan.info.arch.controller;

import n_bogdan.info.arch.service.MyOnwService;

import java.net.http.HttpRequest;

/**
 * Кстати, это контроллер
 */
public class MyOwnController {
    private MyOnwService myOnwService = new MyOnwService();


//    @GetMapping("/login")
    void login(HttpRequest request) {
        request.headers();
        myOnwService.login(request);
    }
}
