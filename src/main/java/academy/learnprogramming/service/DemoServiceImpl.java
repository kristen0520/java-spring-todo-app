package academy.learnprogramming.service;

import academy.learnprogramming.controller.DemoController;
import academy.learnprogramming.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {


    @Override
    public String getHelloMessage(String user) {
        return "hello " + user;
    }

    @Override
    public String getWelcomeMessage() {
        return "Welcome to this demo application.";
    }
}
